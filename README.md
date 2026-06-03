# Projet Java - Gestion de Comptes Bancaires

## Description

Ce projet Java illustre les principes de la **programmation orientée objet** (POO) à travers un système simplifié de gestion de comptes bancaires. Il met en œuvre l'héritage.

---

## Structure du projet

```
src/
├── BankAccount.java        # Classe mère 
├── CheckingAccount.java    # Compte courant (avec limite de découvert)
├── SavingsAccount.java     # Compte d'épargne
├── COD.java                # Certificat de Dépôt
└── Main.java               # Point d'entrée du programme
```

---

## Description des classes

### `BankAccount` (classe mère)

Classe de base dont héritent tous les types de comptes. Elle contient :

| Attribut   | Type     | Description                              |
|------------|----------|------------------------------------------|
| `account`  | `String` | Numéro du compte (null si non initialisé) |
| `balance`  | `double` | Solde du compte (-1 si non initialisé)   |

**Méthodes :**
- `getAccount()` / `setAccount(String account)` — lecture/écriture du numéro de compte
- `getBalance()` / `setBalance(double balance)` — lecture/écriture du solde

**Validations :**
- Le numéro de compte ne peut pas être `null` ou vide
- Le solde ne peut pas être négatif
- Des `IllegalStateException` sont levées si les getters sont appelés avant initialisation

---

### `CheckingAccount` (Compte Courant)

Hérite de `BankAccount`. Ajoute une **limite de découvert**.

| Attribut | Type     | Description                                   |
|----------|----------|-----------------------------------------------|
| `limit`  | `double` | Limite de découvert (-1 si non initialisée)   |

**Méthodes supplémentaires :**
- `getLimit()` / `setLimit(double limit)` — lecture/écriture de la limite

**Validations :**
- La limite ne peut pas être négative

---

### `SavingsAccount` (Compte d'Épargne)

Hérite de `BankAccount`. Représente un compte d'épargne standard.  
Utilise directement les attributs et méthodes de `BankAccount`.

---

### `COD` (Certificat de Dépôt)

Hérite de `BankAccount`. Représente un certificat de dépôt bancaire.  
Utilise directement les attributs et méthodes de `BankAccount`.

---

### `Main` (Point d'entrée)

Illustre la création et l'utilisation des trois types de comptes :

```
Compte courant
Numéro : CA-009
Solde  : 150000.0 FCFA

Compte d'Epargne
Numéro : SA-009
Solde  : 500000.0 FCFA

Certificat de Dépôt
Numéro : COD-009
Solde  : 1000000.0 FCFA
```

---


## Prérequis

- **Java** 21
- Un IDE Java (IntelliJ IDEA, Eclipse, VS Code avec extension Java…) ou le JDK en ligne de commande

---

## Auteur

KOUASSI KOUADIO BRICE HERMANE.