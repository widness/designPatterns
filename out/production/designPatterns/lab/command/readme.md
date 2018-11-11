**Intent:** let you parameterize clients with 
 - different requests
 - queue
 - log requests
 - Undoable operations

**Example:** When we play with a remote control (telecommand)

**Participants:** 
  * Client (RemoteLoader)
    - Create Receiver (Light)
    - Give to them a ConcreteCommand (LightOnCommand)
    - Add theme to the Invoker (RemoteControl)
    
  * Invoker (RemoteControl)
    - Binds buttons and they action 
    - Trigger the action on click
    
  * receiver (Light)
    - The object with his value (position, intensity)
    
  * ConcreteCommand (LightOnCommand)
    - Execute, Undo the receiver
    
  * Command
    - Execute, Undo
    - store, load (for the logging)
    
  * MacroCommand
    - Enable multiple ConcreteCommand to be trigger in one action