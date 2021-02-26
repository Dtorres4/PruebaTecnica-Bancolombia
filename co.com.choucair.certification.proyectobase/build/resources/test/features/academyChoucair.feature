# Autor: Daniel Torres
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course

  @scenario1
  Scenario Outline: Search for a automation course
  //Given than Daniel wants to learn automation at the academy Choucair
  //When he search for the course Metodología Bancolombia on the choucair academy platform
  //Then he finds the course called resources Metodología Bancolombia

    Given than Daniel want to learn automation at the Academy choucair
      | strUser   | strPassword   |
      | <strUser> | <strPassword> |
    When he search for the course on the Choucair Academy platform
      | strCourse   |
      | <strCourse> |
    Then he finds the course called
      | strCourse               |
      | Metodología Bancolombia |

    Examples:
      | strUser | strPassword  | strCourse               |
      | 1057594542  | Choucair2021* | Metodología Bancolombia |


