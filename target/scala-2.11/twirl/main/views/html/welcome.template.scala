
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object welcome_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class welcome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Welcom")/*1.16*/( new ArrayList() )/*1.35*/ {_display_(Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*2.1*/("""<section class="headline-sec">
  <div class="overlay ">
    <h3 >Welcom! <i class="fa fa-angle-double-right "></i></h3>
  </div>
</section>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object welcome extends welcome_Scope0.welcome
              /*
                  -- GENERATED --
                  DATE: Mon Jul 11 16:52:07 CDT 2016
                  SOURCE: /Users/Lufan/Desktop/summer_project/app/views/welcome.scala.html
                  HASH: 96bd4eacb3b3f066e679ef44f358cc3f9636a960
                  MATRIX: 831->1|853->15|880->34|919->36|946->37
                  LINES: 32->1|32->1|32->1|32->1|33->2
                  -- GENERATED --
              */
          