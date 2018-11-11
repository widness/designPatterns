**Intent:** 
  - The object encapsulates its states into separate classes: the behavior will change along with the internal state

**Exemple:** Etat d'une machine
  - Elle peut être occupé, en traitement, out of cash, etc...

**Participants:**
  * Context (GumballMachine)
    - Have a number of internal states (have many states possibility)
  
  * State
    - Common interface for all concrete states
    - All ConcreteState implement the same interface, so they're interchangeable
    
  * ConcreteState
    - Handle requests from the Context.
    - Provides its own implementation for a request
  