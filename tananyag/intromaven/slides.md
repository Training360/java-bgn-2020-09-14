class: inverse, center, middle



# Maven

---

# Maven

* Nincs Java platformon standard projekt struktúra
* Segít a build folyamatban
* Függőségkezelés
* Software project management and comprehension tool
* Convention over configuration

---

# Build folyamat

* Forrás állományok fordítása
* Többi, un. erőforrás állomány kezelése
* Teszt esetek futtatása
* Alkalmazás összecsomagolása

---

# Struktúra

* `pom.xml` projekt leíró állomány
* `src\main\java` Java forráskódok
* `src\main\resources` Erőforrás állományok
* `src\test\java` Teszt esetek, nem része az alkalmazásnak
* `src\test\resources` Teszt esetekhez szükséges egyéb erőforrás állományok, nem része az alkalmazásnak

---

# `pom.xml` felépítése

* Projekt azonosítói: `groupId`, `artifactId`, `version`
* Karakterkódolás
* Java verziója
* Függőségek
