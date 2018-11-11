Classic: on fait un if-else pour voir si la class à déjà était instancié
    ! Dangereux en cas de multythreading
Synchronization: classic mais avec syncronised à l'appel du constructor
    ! Perte de performance
Eager: Déclaré en static 
    ! Plus lent au démarrage
Double-checked locking: Double if avec syncronisation au milieu
    Ajout de "volatile" à la variable déclaré