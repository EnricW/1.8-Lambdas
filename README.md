# Lambdas 🎯

## 📄 Descripció - Enunciat de l'exercici

Aquest projecte està format per 13 exercicis que exploren l'ús de lambdas a Java:

### Nivell 1 ⭐
#### Exercicis:
- Aplicació de Stream.filter() per trobar strings que continguin la lletra 'o', usant predicat lambda
- Aplicació de doble condició amb Stream.filter(): conté 'o' i té més de 5 lletres
- Ús de lambda per recórrer i imprimir elements d'una llista de mesos
- Ús de method reference per imprimir elements, demostrant una sintaxi més compacta que la lambda
- Creació d'una Functional Interface simple per definir i assignar un valor de Pi
- Ús de lambda amb Comparator per ordenar strings de més curt a més llarg
- Variant de l'exercici anterior, però ordenant de més llarg a més curt
- Creació d'una Functional Interface amb lambda per implementar un mètode de reversió de strings

### Nivell 2 ⭐⭐
#### Exercicis:
- Aplicació de Stream.filter() amb múltiples condicions:
  - Filtrar strings que comencen amb 'A' majúscula
  - Verificar que tinguin exactament 3 lletres
  - Ús de predicats lambda per filtrar la llista
- Transformació de llista d'enters:
  - Conversió de llista a string
  - Ús de lambda/Stream per afegir prefix 'e' o 'o' depenent de la paritat
  - Concatenació dels elements amb format específic
- Creació de Functional Interface per operacions matemàtiques:
  - Definir interfície amb mètode que retorna float
  - Ús de lambda per implementar diverses operacions (suma, resta, multiplicació, divisió)
  - Demostra flexibilitat de les expressions lambda
- Operacions complexes amb Stream i lambda:
  - Ordenació de llista mixta (strings i nombres)
  - Ordenació per primer caràcter
  - Filtrat de strings amb 'e'
  - Transformació de strings (reemplaçar 'a' per '4')
  - Filtrat d'elements numèrics


### Nivell 3 ⭐⭐⭐
#### Exercici de tractament de llista d'alumnes amb lambdes i Streams:
- Creació de classe Alumne amb atributs: Nom, edat, curs i nota
- Omplir una llista amb 10 alumnes
- Operacions amb Streams i lambdes:
  - Imprimir nom i edat de cada alumne
  - Filtrar alumnes amb nom que comença per 'a'
  - Filtrar alumnes amb nota 5 o superior
  - Filtrar alumnes amb nota 5+ que no fan PHP
  - Filtrar alumnes de JAVA majors d'edat

## 💻 Tecnologies Utilitzades

- Java SE Development Kit (JDK) 17
- IntelliJ IDEA
- Git
- GitHub

## 📋 Requisits

- Java JDK 17 o superior
- IntelliJ IDEA (Community o Ultimate Edition)
- Git instal·lat al sistema

## 🛠️ Instal·lació

1. Clona el repositori:
```bash
git clone https://github.com/EnricW/1.8-Lambdas.git
```

2. Obre el projecte amb IntelliJ IDEA:
   - Obre IntelliJ IDEA
   - File -> Open
   - Selecciona la carpeta del projecte
   - Espera que el projecte s'indexi i es configurin les dependències

## ▶️ Execució

1. Navega fins a la classe principal que conté el mètode main
2. Fes clic dret sobre la classe
3. Selecciona "Run Main.main()"
