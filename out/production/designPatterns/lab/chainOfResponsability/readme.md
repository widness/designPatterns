**Intent:**
  - Several objects (handlers) that can process similar tasks (requests).
  - Requests with unknown handler.
  - Add or remove handlers dynamically.

**Exemple:** A l'armée quand on fait une demande de congé
  - On donne au sergent, si il à le droit d'accepté, il nous rend réponse.
    Sinon il donne à l'instance en dessus de lui, qui fera la même chose.
    Ainsi de suite jusqu arrivé à la plus haute des instances.


**Participants:**
  * Client
    - Personne qui fait la requête
  
  * Handler (PurchasePower)
    - handleRequest: donne réponse
    - setSuccessor: passe au prochain ConcreteHandler
  
  * ConcreteHandler
    - Instance