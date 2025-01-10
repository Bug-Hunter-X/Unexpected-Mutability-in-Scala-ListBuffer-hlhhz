# Scala ListBuffer Mutability Bug

This repository demonstrates a common mistake when using Scala's `ListBuffer`.  While `toList` correctly creates an immutable `List`, directly using `result()` from ListBuffer yields a mutable object, causing unexpected behavior.  The solution shows the proper way to convert to immutable List.

## Bug

The bug lies in the misuse of `result()` method which returns a mutable ListBuffer instead of creating an immutable List.  This results in unintended mutability of what appears to be an immutable list. 

## Solution

The solution uses the `toList` method for proper conversion to an immutable List, preventing further modifications.