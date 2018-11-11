**Intent:**
  - Allows us to build structures of objects in the form of trees.
  - Lets clients treat individual objects and compositions of objects uniformly.
  
**Exemple:** 
  - Creation d'une carte de menu dans un restaurent
    On a plusieurs menu, avec des plats différents.
    On peut aussi accéder directement au plat.

**Participants:**
  * Client (Waitress)
    - Use the Component to access the Composite & the Leaf
  
  * Component (MenuComponent)
    - Add, remove and getChild + the operations.
  
  * Leaf (MenuItem)
    - Hast no children
    - Define de behavior for the elements in the composition.
  
    - Define behavior of the components having children.
  * Composite (Menu)
    - Store child components.
    - Implements the leaf-related operations.
    
 **Others**
 Iterator: Better way to printAll()