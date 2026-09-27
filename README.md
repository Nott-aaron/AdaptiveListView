# Experiment 7 — Adaptive UI using ListView and ImageView

## Student Details

**Name:** Spencer Aaron Fernandes  
**USN:** 25MCAR0123  
**Experiment:** 7

---

## Aim

To create an adaptive Android user interface using **ListView and ImageView**, along with a custom ArrayAdapter and AlertDialog for displaying pet information.

---

## Scenario

### Pet Catalog

The application displays a list of different pets available in a simple pet catalog.

Each pet is displayed using a custom list item containing:

- Pet image
- Pet name
- Short description
- Adoption fee

When the user taps on a pet, a dialog opens showing a larger image of the selected pet and its name.

---

## Technologies and Concepts Used

- Android Studio
- Kotlin
- XML Layouts
- ListView
- ImageView
- Custom ArrayAdapter
- Data Class
- AlertDialog
- Vector Drawables
- Material-style UI
- Adaptive UI Design

---

## Features

### 1. Pet Catalog

The application displays six different pets:

| Pet | Description | Adoption Fee |
|---|---|---:|
| Labrador | Friendly and playful | ₹8,000 |
| Persian Cat | Calm and affectionate | ₹6,000 |
| Beagle | Active and friendly | ₹7,000 |
| Rabbit | Small and gentle | ₹2,500 |
| Parrot | Social and intelligent | ₹3,000 |
| Turtle | Quiet and easy to maintain | ₹1,500 |

### 2. Custom ListView

A custom `ArrayAdapter` is used to display each pet.

Each row contains:

- `ImageView` for the pet icon
- `TextView` for the pet name
- `TextView` for the description
- `TextView` for the adoption fee

### 3. Pet Details Dialog

When a user taps on a pet, an `AlertDialog` is displayed.

The dialog contains:

- Larger pet image
- Pet name
- CLOSE button

### 4. Vector Drawables

Custom vector drawable files are used for the pet icons:

    pet_labrador.xml
    pet_persian.xml
    pet_beagle.xml
    pet_rabbit.xml
    pet_parrot.xml
    pet_turtle.xml

### 5. Card-Style List Items

Each pet is displayed inside a rounded card-style layout using:

    card_bg.xml

The card uses rounded corners and spacing to provide a clean interface.

---

## Project Structure

    AdaptiveListView/
    │
    ├── app/
    │   └── src/
    │       └── main/
    │           ├── java/
    │           │   └── com/example/adaptivelistviewmad7/
    │           │       ├── MainActivity.kt
    │           │       ├── MyAdapter.kt
    │           │       └── Pet.kt
    │           │
    │           ├── res/
    │           │   ├── drawable/
    │           │   │   ├── card_bg.xml
    │           │   │   ├── pet_labrador.xml
    │           │   │   ├── pet_persian.xml
    │           │   │   ├── pet_beagle.xml
    │           │   │   ├── pet_rabbit.xml
    │           │   │   ├── pet_parrot.xml
    │           │   │   └── pet_turtle.xml
    │           │   │
    │           │   ├── layout/
    │           │   │   ├── activity_main.xml
    │           │   │   ├── list_item.xml
    │           │   │   └── dialog_pet.xml
    │           │   │
    │           │   └── values/
    │           │       ├── colors.xml
    │           │       ├── strings.xml
    │           │       └── themes.xml
    │           │
    │           └── AndroidManifest.xml
    │
    ├── screenshots/
    │   ├── output.png
    │   ├── testcase1.png
    │   ├── testcase2.png
    │   └── testcase3.png
    │
    ├── build.gradle.kts
    └── README.md

---

## Application Flow

    Launch Application
            │
            ▼
       Pet Catalog
            │
            ▼
       Display ListView
            │
            ▼
        Select a Pet
            │
            ▼
     Display Pet Details
           Dialog
            │
            ▼
          CLOSE
            │
            ▼
      Return to Pet List

---

## Main Components

### `MainActivity.kt`

The main activity:

- Initializes the application.
- Creates the list of pets.
- Connects the pet list with the `ListView`.
- Uses `MyAdapter`.
- Handles pet selection.
- Displays the pet details dialog.

### `Pet.kt`

Contains the `Pet` data class.

    data class Pet(
        val name: String,
        val desc: String,
        val price: String,
        val imageRes: Int
    )

### `MyAdapter.kt`

The custom adapter extends:

    ArrayAdapter<Pet>

It binds each pet's:

- Image
- Name
- Description
- Adoption fee

to the corresponding views in `list_item.xml`.

### `activity_main.xml`

Contains:

- Application title
- ListView
- Student details footer

### `list_item.xml`

Defines the appearance of each pet in the ListView.

### `dialog_pet.xml`

Defines the custom dialog layout used when a pet is selected.

---

# Test Cases

## Test Case 1 — Application Launch

### Objective

Verify that the application launches successfully and displays the pet catalog.

### Steps

1. Launch the application.
2. Observe the application header.
3. Check the pet list.
4. Verify the student details at the bottom.

### Expected Result

The application displays:

- **Pet Catalog** header
- Six pet entries
- Pet icons
- Pet names
- Pet descriptions
- Adoption fees
- Student name and USN

### Expected Output

    Pet Catalog

    Labrador          ₹8,000
    Friendly and playful

    Persian Cat       ₹6,000
    Calm and affectionate

    Beagle            ₹7,000
    Active and friendly

    Rabbit            ₹2,500
    Small and gentle

    Parrot            ₹3,000
    Social and intelligent

    Turtle            ₹1,500
    Quiet and easy to maintain

    Spencer Aaron Fernandes | USN: 25MCAR0123 | Experiment 7

---

## Test Case 2 — Select a Pet

### Objective

Verify that selecting a pet opens the pet details dialog.

### Steps

1. Launch the application.
2. Tap on any pet from the ListView.
3. Observe the dialog.

### Expected Result

A dialog appears containing:

- Large pet image
- Selected pet name
- CLOSE button

For example, selecting **Labrador** displays:

    [Pet Image]

    Labrador

    CLOSE

---

## Test Case 3 — Close Pet Details

### Objective

Verify that the dialog closes correctly.

### Steps

1. Select any pet.
2. Wait for the details dialog to appear.
3. Tap **CLOSE**.

### Expected Result

The dialog closes and the user is returned to the Pet Catalog ListView.

---

# UI Design

The application uses a simple card-based interface.

### Header

The top section displays:

    Pet Catalog

### Pet Cards

Each pet card contains:

    [Image]  Pet Name                 ₹Fee
             Short description

### Footer

The bottom section displays:

    Spencer Aaron Fernandes | USN: 25MCAR0123 | Experiment 7

---

# Result

The **Pet Catalog** Android application was successfully designed using **ListView and ImageView**.

The application demonstrates:

- Custom ListView
- Custom ArrayAdapter
- ImageView
- Vector drawables
- Data-driven UI
- AlertDialog
- Click interaction
- Card-based UI design

The application successfully displays pet information and allows users to select a pet and view its details through a dialog.

---

# Conclusion

This experiment demonstrates how an adaptive Android interface can be created using **ListView and ImageView**. A custom ArrayAdapter is used to dynamically populate the list with pet information, while AlertDialog provides an interactive way to display additional details.

The application provides a simple and user-friendly interface for browsing pets in a catalog.

---
