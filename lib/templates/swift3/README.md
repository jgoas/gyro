# Swift3 Template Information

| Name      | Description       |
| --------- | ----------------- |
| Folder name | templates/swift3 |
| Invocation example | `gyro -m <model> -t swift3 …` |
| Language | Swift 3 and Swift 4 |

# When to use it

This template is the reference for swift 3 with Realm generation code. This template is compatible with swift 4.
You can use it when you need to work with `Realm`

# Caracteristics

In this template optional Realm objects (Attributes - RealmOptional - or Relationships - List<> -) are `let` properties (conform to the Realm documentation) :

```
// Attribute generation
{%- if attribute.is_number == true or attribute.is_bool == true %}
  let {{ attribute.name }} = RealmOptional<{{ convert_type }}>()
{%- else %}
  @objc dynamic var {{ attribute.name }}: {{ convert_type }}?
{%- endif -%}

// Relationship generation
{%- if relationship.inverse == false %}
  {%- if relationship.type == "to_many" %}
  let {{ relationship.name }} = List<{{ relationship.inverse_type }}>()
  {%- else %}
  @objc dynamic var {{ relationship.name }}: {{ relationship.inverse_type }}?
  {%- endif %}
{%- endif %}
```

# Generated Code

`Product.swift` :

```swift
/* DO NOT EDIT | Generated by gyro */

import RealmSwift
import Foundation

final class Product: Object {

  enum Attributes: String {
    case brand = "brand"
    case name = "name"
    case price = "price"
    case users = "users"
  }

  @objc dynamic var brand: String?
  @objc dynamic var name: String = ""
  let price = RealmOptional<Int32>()

  let users = List<Users>()
}
```
