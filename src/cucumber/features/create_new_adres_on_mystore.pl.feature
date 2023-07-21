Feature: create  new account on mystore.
  Scenario Outline: create  new account on https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account
    Given : data account <email> ,<password> .
    When : user name show on up right site next to Sign out button.
    Then : scroll down to your account menu
    And : click Addresses button
    Then : click on '+created new address'
    Then : fill out the form add '<alias>','<address>','<city>','<zip/postal code>','<country>','<phone>'.
    And :check out form data.

    Examples:
    |alias|address   |city    |zip/postal code|country|phone    |email                       |password |
    |jan  |konwaliowa|Warszawa|01-033          |poland|546225874|"nlqanyskftavfehbuy@bbitf.com"|123456789|
