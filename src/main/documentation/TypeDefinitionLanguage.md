#Type Defintion Language

##Naming Convention

A `Type` identifier starts with an UpperCase character and can be followed with any number of uppercase characters, lowercase characters or digits.

    TYPE_ID : ('A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')* ;

##Native Data Types

All data types in IDEAL are immutable. That means that once they are assigned a value, that value can not be changed.

1. `octet`

   An atomic group of 8 bits. Also known as a `byte`, representing the numbers `0` to `255` inclusive.

1. `Bytes`

    This is the most basic type in IDEAL. It represents one or more `byte` values in `Network Byte Order`.
    
    Every object is nothing more than a `Bytes` object interpreted in a specific manner.
    
1. `String` : `Bytes`

    A `String` is a `Bytes` interpreted by a specific character set and encoding. The native character set is Unicode and the encoding used in memory is `UTF-8`.

1. `Integer` : `Number` : `Bytes`

    A `Number` is any positive or negative number of arbitrary precision and length.

    An `Integer` is a specialization of `Number` that is any positive or negative whole number.
    
    Numbers are a `Bytes` reference that is interpreted using `Big Endian`/`Network` byte ordering.
    
    There are functions that will allow a `Bytes` to be interpreted as `Little Endian` byte ordering when needed.

All other types can be derived from one of these types and be given a specialized name and constraints. Examples of such types included with the language would be `URI`, `URL` which are all specializations of `String`. `Instant` is a specialization of `String` and `Number`. `Uuid`, `IPV4`, and `IPV6` are all specializations of `String` and `Bytes`.

##Domain Data Types

Domain data types are common well specified data types with one or more representations other than a string array of octets. Here are some of the planned domains and the data types to be included in the language. The following is not a complete list until the language reaches `1.0.0`.

###Temporal

1. `Millisecond` : `Integer`

1. `Second` : `Integer`

1. `Minute` : `Integer`

1. `Hour` : `Integer`

1. `Time` : `Hour` : `Minute` : `Second` : `Millisecond` : `String`

    ISO 8601 Time in 24 hour format.
    
    `hh:mm:ss[.fff]`

1. `Day` : `Integer`

1. `Month` : `Integer` : `String`

1. `Year` : `Integer`

1. `Date` : `Year` : `Month` : `Day` : `String`

    ISO 8601 format Calendar Date format. 
    `YYYY-MM-DD`

1. `Instant` : `Date` : `Time` : `String`

    ISO 8601 format full Date and Time format in UTC time zone. 
    
    `YYYY-DD-MM'T'hh:mm:SS[.fff]Z`

###Network

1. `IpAddressv4` : `String` : `Integer` : `Bytes`

    Internet Protocol Address Version 4
    
    An IPv4 address has the following format: `x . x . x . x` where `x` is called an `octet` and must be a decimal value between `0` and `255`. Octets are separated by periods. An IPv4 address must contain three periods and four octets. 
    
    The following examples are valid IPv4 addresses:
    
    ```
    1.2.3.4
    01 . 102 . 103 . 104
    ```
    Spaces and leading `0` are allowed and should be ignored.

1. `IpAddressv6` : `String` : `Bytes`

    Interent Protocol Address Version 6
    
    An IPv6 (Normal) address has the following format: `y : y : y : y : y : y : y : y` where `y` is called a segment and can be any hexadecimal value between `0` and `FFFF`. The segments are separated by colons - not periods. 
    
    The following list shows examples of valid IPv6 (Normal) addresses:
    
    ```
    2001 : db8: 3333 : 4444 : 5555 : 6666 : 7777 : 8888
    2001 : db8 : 3333 : 4444 : CCCC : DDDD : EEEE : FFFF
    : : (implies all 8 segments are zero)
    2001: db8: : (implies that the last six segments are zero)
    : : 1234 : 5678 (implies that the first six segments are zero)
    2001 : db8: : 1234 : 5678 (implies that the middle four segments are zero)
    2001:0db8:0001:0000:0000:0ab9:C0A8:0102 (This can be compressed to eliminate leading zeros, as follows: 2001:db8:1::ab9:C0A8:102 )
    ```
    Spaces and leading `0` are allowed and should be ignored.

1. `MacAddress` : `String` : `Bytes`

    Media Access Control Address

###Internet

1. `Url` : `String`

    Uniform Resource Locator
    
    ```
    [scheme:][//authority][path][?query][#fragment]
    ```

1. `Urn` : `String`

    Uniform Resource Name
    
    ```
    [scheme:]scheme-specific-part[#fragment]
    ```

1. `Uri` : `Urn` : `Url` : `String`

    Uniform Resource Identifier
    
###Identifiers

1. `Uuid` : `String` : `Bytes`

Universally Unique IDentifier as described in [RFC4112](https://tools.ietf.org/html/rfc4122)
    
#Syntax

TYPE_ID
