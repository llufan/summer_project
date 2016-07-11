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

        //check if password == repeatPassword

        //check if user already exited

        //print message sign-up success

        //email confirmation



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

    public Result postLogin() {

    	Form<LoginForm> formData = Form.form(LoginForm.class).bindFromRequest();

        LoginForm login = formData.get();

        Optional<User> potentialUser = User.findByEmail(login.email);

        if ( !potentialUser.isPresent() ) {
            return redirect( routes.Application.login() );
        }

        User user = potentialUser.get();

        if ( login.password != user.password) {
        	return redirect( routes.Application.login() );
        }

        session().clear();
        session("email", user.email);

    	return redirect( routes.Application.index() );
    }
}