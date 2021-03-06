package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Page1;
import views.html.ks;
import views.html.bh;
import views.html.jm;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result page1() {
    return ok(Page1.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns Kelly Slater.
   * @return The ks.
   */
  public static Result ks() {
    return ok(ks.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns Bethany Hamilton.
   * @return The bh.
   */
  public static Result bh() {
    return ok(bh.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns Jake Marshall.
   * @return The jm.
   */
  public static Result jm() {
    return ok(jm.render("Welcome to Page1."));
    
  }
}
