/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package demo2;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum Sex implements TEnum {
  Man(0),
  Woman(1);

  private final int value;

  private Sex(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static Sex findByValue(int value) { 
    switch (value) {
      case 0:
        return Man;
      case 1:
        return Woman;
      default:
        return null;
    }
  }
}