**Intent:**
  - Provide a unified interface to a set of interfaces in a subsystem.
  - Defines a higher-level interface that makes the subsystem easier to use.
 
**Example:** 
  - Maison intelligeante -> Depuis l'écran principale on peut tout changer (Température, éclairage, store, ...).
  - En gros: Une interface qui implémente toute les autres.
  
**Participants:**
  * Facade (HomeTheaterFacade)
    - Implement the Subsystem classes
    - Also contains macro.
    
  * Subsystem classes (All the others)
    - Contains logic