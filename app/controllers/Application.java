package controllers;

import play.data.Form;
import play.Logger;
import play.mvc.*;
import play.mvc.Result;
import views.html.*;
import views.formdata.*;
import models.*;

import java.util.*;

public class Application extends Controller {
	
	public Result index() {
		return ok(home.render());
	}

	public Result login() {
		return ok(login.render());
	}

	public Result signup() {
		return ok(signup.render());
	}

	public Result registerUser() {
        // Validate the form.
		//Form<SignUpForm> formData = Form.form(SignUpForm.class).bindFromRequest();

		Form<SignUpForm> formData = Form.form(SignUpForm.class).bindFromRequest();

        SignUpForm newForm = formData.get();

        //SignUpForm newForm = Form.form( SignUpForm.class ).bindFromRequest().get();

        User user = new User(
                newForm.email,
                newForm.firstName,
                newForm.lastName,
                newForm.password,
                newForm.repeatPassword,
                newForm.role
                
        );

        user.save();

        if (!user.password.equals(user.repeatPassword)) {
        	user.delete();
            return ok(signup.render());
        }

        return redirect( routes.Application.login() );
    }
}