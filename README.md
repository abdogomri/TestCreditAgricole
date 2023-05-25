Documentation en cours d'ecriture...

![image](https://github.com/abdogomri/TestCreditAgricole/assets/26137154/39a557f6-c171-4f4b-849f-e77a15612933)

Cette application bancaire contient deux écran le premier écran est celui qui montre les comptes d'utilisateur , regroupés en deux section :
1- les comptes Credit agricole

2- Les autres comptes

 - Light and Dark theme supported
 - Screen orientation change

et un écran qui montre les opérations éffectuées dans ce comptes regroupées et triées par dates et par nom d'opération .

La navigation dans l'application est montré dans le schema suivant : 

Dans le cadre de ce projet il y avait plusieurs choix à faire (technologies, architecture , modularisation ...)

![Untitled (2)](https://github.com/abdogomri/TestCreditAgricole/assets/26137154/fdba4319-1740-4c4c-af9e-124c6ea1e5c0)

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
Reactive Programming : Flow & compose state
Vue Architecture : Single activity application

Ce Projet contient deux branches : 

[Main](https://github.com/abdogomri/TestCreditAgricole) : contient l'application avant modularisation 

[Multimodule](https://github.com/abdogomri/TestCreditAgricole/tree/multimodule) : contient l'application modularisé

Modularisation :

![Untitled](https://github.com/abdogomri/TestCreditAgricole/assets/26137154/da686ecf-7a6e-498a-a151-4ae5d3b6eb33)

Cette méthode de modularisation de l'application est fondée sur le principe de la "séparation of concerns ". Dans notre cas, nous constatons l'existence de liens unidirectionnels, ce qui entraîne un couplage léger entre les modules de l'application.

App: contient l'activité de notre application et la navigation entre les écrans 
Domain : contient la logique métier de notre application.
Data:Network : notre seule source de données avec (Retrofit) .
Core:UI : représente notre système de design et les différents composants qui reflètent l'identité de notre application.
Core:Util : contient des méthodes utilitaires pour les autres modules.
Core:Model : représente les modèles et les data classes utilisés pour la logique métier de notre application.
Feature:FeatureName : représente les écrans @composable des fonctionnalités ainsi que la partie de routage (navigation correspondante).

Product Flavors :

l'application contient deux Product flavors : 

- MOCK_CA_ : pour ne pas épuiser la remoteDatasource (100 appels max), on utilise le fichier json comme mock
- PROD_CA_ : contient l'appel WS donc en mode connecté 









