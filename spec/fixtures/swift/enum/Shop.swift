/* DO NOT EDIT | Generated by gyro */

import RealmSwift
import Foundation

final class Shop: Object {

  enum Attributes: String {
    case name = "name"
    case optionalValue = "optionalValue"
    case type = "type"
  }

  dynamic var name: String = ""

  dynamic var optionalValue: String?
  var optionalValueEnum: OptValue? {
    get {
      guard let optionalValue = optionalValue,
        let enumValue = OptValue(rawValue: optionalValue)
        else { return nil }
      return enumValue
    }
    set { optionalValue = newValue?.rawValue ?? nil }
  }


  dynamic var type: String = ""
  var typeEnum: Type? {
    get {
      guard let enumValue = Type(rawValue: type) else { return nil }
      return enumValue
    }
    set { type = newValue?.rawValue ?? "" }
  }


}
