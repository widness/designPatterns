**Intent:**
  - Defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
  - Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm'
  
**Exemple:** 
  - On a un Starbucks wui vend plusieurs boissons chaude (thé & Café)
    Bouillire de l'eau sera identique des deux côté.
    "Brew" ne le sera pas
    On met tout dans la même interface et on ajoute en abstract les méthodes qui devront changer
    Cela nous évite de devoir coder plusieurs fois la même classes

**Participants:**
  * AbstractClass (CaffeineBeverageWithHook)
    - Implement: 
      - static method -> For every object the same action.
      - abstract method -> Object specific.
      - Hook method -> default but could be overridden.
  
  * ConcreteClass (CoffeeWithHook)
    - Add logic to the static & hook method
    
**Others**    
  * Hook (caffeineBeverageWithHook.customerWantsCondiments())
    - Method with a mostly empty default implementation
    - Can be overridden by the user