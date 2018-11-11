**Intent:**
 - Convert the interface of a class into another interface clients expect
 - Lets classes work together that couldn't otherwise because of incompatible interfaces

**Example:** Prise éléctrique -> en Angletaire on utilise un adapteur

**Participants:**

 * Client (Duck that want to be a Turkey): 
   - Notre cable suisse
    
 * Adapter (DuckAdapter):
   - l'adapteur
  
 * Adaptee (The object given by the DuckAdapter):
   - La prise anglaise
   
**Others**
  * Class Adapter: 
    Uses inheritance and can only wrap a class. 
    It cannot wrap an interface since by definition it must derive from some base class.

  * Object Adapter: 
    Uses composition and can wrap classes or interfaces, or both. It can do this since it contains, 
    as a private, encapsulated member, the class or interface object instance it wraps.