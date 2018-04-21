# ISI 3 : Tests Unitaires

Rapport à rendre dans [Rapport.md](Rapport.md)

## Exercice 1: L'approche TDD sur le Fizz Buzz Kata

Dans cet exercice, vous allez implémenter une solution au `Fizz Buzz` Kata en Java en suivant l'approche TDD présentée précédement.
Vos tests devront être de type boite noire.

Les règles à implémenter dans l'ordre:`
1. La fonction fizzBuzz retourne une list de `String` représentant les nombres
2. Les multiples de 3 affichent `Fizz`
3. Les multiples de 5 affichent `Buzz` 
4. Les multiples de 3 et de 5 affichent `Fizz Buzz`
5. Les multiples de 7 affichent `It's a trap`
6. Le nombre 42 affiche `La grande question sur la vie, l'univers et le reste`
7. Inverser l'ordre des règles *2* et *5*


>Questions 

* Qu'est ce qu'un test boite noire ?

* Qu'est ce qu'un test boite blanche ?

* Comment pourriez vous définir l'approche TDD ? Comment avez-vous travaillé ? Qu'en pensez-vous ?

* Qu'apporte l'usage de tests dans cet exercice ?


## Exercice 2: Tests unitaires et mock

Dans cet exercie la classe [Vector](unit/src/main/java/Vector.java) a été codé avec les pieds.
Les tests unitaires montrent que le code ne marche pas.

Cependant, la classe Person qui utilise Vector a également ses tests qui échouent.


> Questions

* Si on a la volonté de faire des tests unitaires, cette situation est-elle normale ? Pourquoi ?

* Mockito permet de faire ici trois choses, lesquels ?