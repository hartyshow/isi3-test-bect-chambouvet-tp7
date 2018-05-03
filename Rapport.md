Nom Etudiant 1: Bect Corentin

Nom Etudiant 2: Chambouver-Lauricella Gaëtan

# ISI 3 : Tests Unitaires

## Exercice 1: L'approche TDD sur le Fizz Buzz Kata

* Qu'est ce qu'un test boite noire ?

Un test boite noire consiste à vérifier que les sorties obtenues sont celles attendues pour des entrées données, et ce, sans tenir compte de l'implémentation du programme testé.

* Qu'est ce qu'un test boite blanche ?

À l'inverse d'un test boite noire, un test boite blanche consiste à vérifier que les sorties obtenues sont celles attendues pour des entrées données, et ce, en tenant compte de l'implémentation du programme testé.

* Comment pourriez vous définir l'approche TDD ? Comment avez-vous travaillé ? Qu'en pensez-vous ?

Le TDD consiste à écrire les tests avant même d'écrire le code, et donc considérer le développment comme un ensemble de tests élaborés à l'avance. Nous avons fonctionné en programmant nos tests, avant d'écrire et retravailler le code jusqu'à qu'ils passent tous sans exception. Nous pouvions ensuite ajouter la fonctionnalité suivante demandée.

Nous pensons que ce type d'approche est intéressante car elle permet de gagner du temps en s'assurant de ne pas dégrader le code lorsque l'on cherche à l'améliorer au moment même où on l'écrit. Cela peut également permettre de structurer sa pensée avant d'écrire le code final en se représentant les valeurs à tester.

* Qu'apporte l'usage de tests dans cet exercice ?

Dans cet exercice, les tests sont très importants car on nous demande à plusieurs reprises de modifier notre code pour y ajouter des fonctionnalités. Or, en fonction des choix réalisés, modifier ce code sans altérer les étapes précédentes peut être assez difficile. Utiliser des tests a donc l'avantage de s'assurer de ne pas compromettre les fonctionnalités précédentes.

## Exercice 2: Tests unitaires et mock

* Si on a la volonté de faire des tests unitaires, cette situation est-elle normale ? Pourquoi ?

Non, cette situation n'est pas normale car les tests unitaires de la classe `Person` dépendaient de l'implémentation de la classe `Vector`. Or, comme leur nom l'indique, les tests unitaires ont vocation à ne tester qu'une seule classe à la fois et le résultat ne doit en aucun cas être impacté par le fonctionnement ou non d'une classe tierce.

Plus concrètement, le code fournit réalisait des appels à la fonction `move()` de `Person` qui fait elle-même des appels à `add()` de `Vector`. Cela pose problème car cette dernière pourrait ne pas fonctionner et donc impacter le résultat de notre test.

Pour résoudre ce problème, nous avons donc utilisé Mockito pour retourner une position factice à l'appel de la fonction `add()` comme ceci :

````java
Mockito.when(defaultPosition.add(deplacement)).thenReturn(position)
````

On teste ensuite que la personne a bien une position qui correspond à celle retournée et que l'appel à `add()` a bien été réalisé avec le déplacement donné :

````java
assertEquals(position, person.getPosition());
Mockito.verify(defaultPosition).add(deplacement);
````

* Mockito permet de faire ici trois choses, lesquels ?

1) De "mocker" un objet, c'est à dire de simuler une instance d'une classe,

2) Créer des espions servant à compter le nombre de fois qu'une fonction a été appelée et avec certains arguments,

3) De "bouchonner" (stub) un appel à une fonction, c'est à dire modifier la valeur de retour d'une fonction.