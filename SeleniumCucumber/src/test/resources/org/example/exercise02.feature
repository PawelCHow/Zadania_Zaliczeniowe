#o	zaloguje się na tego samego użytkownika z zadania 1,
#o	wybierze do zakupu Hummingbird Printed Sweater (opcja dodatkowa: sprawdzi czy rabat na niego wynosi 20%),
#o	wybierze rozmiar M (opcja dodatkowa: zrób tak żeby można było sparametryzować rozmiar i wybrać S,M,L,XL),
#o	wybierze 5 sztuk według parametru podanego w teście (opcja dodatkowa: zrób tak żeby można było sparametryzować liczbę sztuk),
#o	dodaj produkt do koszyka,
#o	przejdzie do opcji - checkout,
#o	potwierdzi address (możesz go dodać wcześniej ręcznie),
#o	wybierze metodę odbioru - PrestaShop "pick up in store",
#o	wybierze opcję płatności - Pay by Check,
#o	kliknie na "order with an obligation to pay",
#o	zrobi screenshot z potwierdzeniem zamówienia i kwotą.
Feature: Exercise02
    As a user
    I want to buy a product
    So that I can pay for it

    Scenario: Buy a product
        Given User is logged in as Gall Anonim
        When User chooses a product
        And User chooses a size
        And User chooses a quantity
        And User adds a product to cart
        And User goes to checkout
        And User confirms address
        And User chooses a delivery method
        And User chooses a payment method
        And User clicks on order with an obligation to pay
        Then User takes a screenshot with order confirmation and amount