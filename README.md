Documentation en cours d'ecriture...

![image](https://github.com/abdogomri/TestCreditAgricole/assets/26137154/39a557f6-c171-4f4b-849f-e77a15612933)

Cette application bancaire contient deux écran le premier écran est celui qui montre les comptes d'utilisateur , regroupés en deux section :
1- les comptes Credit agricole
2- Les autres comptes

et un écran qui montre les opérations éffectuées dans ce comptes regroupées et triées par dates et par nom d'opération .

La navigation dans l'application est montré dans le schema suivant : 

Dans le cadre de ce projet il y avait plusieurs choix à faire (technologies, architecture , modularisation ...)

ces choix ont étés basés sur plusieurs bases : 

I- sécurités de l'application sur -> une application bancaire contien des données sensible et susceptibles aux attaques des hacker voilà une justification de mes choix en ce qui concerne la non utilisation d'une base de donnée (room dans notre cas) .

Quels sont les avantages d'une base de données locale dans une application Android ? Normalement, nous aurions deux avantages :

1- Stockage hors ligne : Une base de données locale permet de stocker les données localement, ce qui permet d'accéder à l'application même sans connexion Internet, offrant une expérience hors ligne.
2- Performances améliorées : Les bases de données locales offrent des performances optimisées pour les opérations de lecture et d'écriture par rapport à l'accès à un réseau distant, ce qui se traduit par des performances améliorées.

Dans le cas d'une application bancaire qui nécessite une connexion Internet constante pour effectuer des opérations, la première raison (avantage 1) devient moins pertinente. De même, le stockage de données sensibles nécessite un cryptage, ce qui peut affecter les performances de l'application, écartant ainsi la deuxième raison (avantage 2). Par conséquent, une option consiste à écarter l'utilisation d'une base de données locale, en optant plutôt pour une seule source de données (NetworkDatasource).

II- Le choix des technologies était un peu moins difficile, surtout avec les dernières technologies de Google qui sont puissantes et efficaces.

Architecture : Clean Architecture basé sur MVVM + modularisation
Language : Kotlin
UI : Jetpack Compose + materialDesign 3
Network : Retrofit
DI : Hilt
Navigation : Compose navigation
Asynchronous dev : Coroutines
Reactive Programming : Flow

Ce Projet contient deux branches : 

[Main](https://github.com/abdogomri/TestCreditAgricole) : contient l'application avant modularisation 

[Multimodule](https://github.com/abdogomri/TestCreditAgricole/tree/multimodule) : contient l'application modularisé

Modularisation :

![Untitled](https://github.com/abdogomri/TestCreditAgricole/assets/26137154/da686ecf-7a6e-498a-a151-4ae5d3b6eb33)







