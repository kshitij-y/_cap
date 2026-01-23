# 🔍 Regular Expressions (Regex) in Java

## 1. Overview & Definition

### 📝 Definition
> A **Regular Expression (Regex)** is a sequence of characters that forms a search pattern. It is a "smart rule" used to check if a text follows a specific format.

*   **Package:** ✅ `java.util.regex` (Must be imported)

### 🚀 Core Uses
1.  **Validation:** Checking emails, passwords, mobile numbers.
2.  **Searching:** Finding specific patterns (e.g., finding all dates in a document).
3.  **Extraction:** Pulling out specific data (e.g., scraping IDs from logs).
4.  **Replacement:** Masking sensitive data (e.g., replacing digits with `*`).

---

## 2. Why Regex? (vs. String Methods)

### The Question
*"Java String class already has `contains()`, `indexOf()`, `startsWith()`. Why do we need Regex?"*

### The Reason
*   **String Methods:** Search for **LITERAL TEXT** (Exact matches).
*   **Regex:** Searches for **PATTERNS** (Dynamic matches).

### ⚡ Comparison Example
**Task:** Find if a string contains a 3-digit number.

*   ❌ **Using String Methods:** You would need a loop, checking `Character.isDigit()` index by index. The logic is long, complex, and error-prone.
*   ✅ **Using Regex:**
    *   **Pattern:** `\\d{3}`
    *   **Result:** Done in one line. Efficient and readable.

---

## 3. Main Classes: Pattern vs. Matcher

Java Regex relies on two main classes in the `java.util.regex` package.

### 1. Pattern Class (The "Stamp")
*   Represents the **compiled version** of the regular expression.
*   It defines the rule.
*   It is immutable and thread-safe.
*   **Syntax:** `Pattern p = Pattern.compile("pattern");`

### 2. Matcher Class (The "Stamping Action")
*   An engine that interprets the Pattern and performs match operations against an input String.
*   It applies the rule to the data.
*   **Syntax:** `Matcher m = p.matcher("inputText");`

### 💻 Code Example

```java
import java.util.regex.*;

public class RegexDemo {
    public static void main(String[] args) {
        // 1. Define Rule (Pattern): Find "Java" (case insensitive)
        Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        
        // 2. Apply Rule (Matcher) on text
        Matcher m = p.matcher("I love Java programming");
        
        // 3. Check results
        if (m.find()) {
            System.out.println("Match found!");
        }
    }
}
```

---

## 4. Regex Symbols & Quantifiers

> ⚠️ **Java Note:** In Java Strings, backslashes must be escaped. So `\d` becomes `\\d`.

### A. Single Character Matching

| Symbol | Description | Real Life Example |
| :--- | :--- | :--- |
| **`.`** | Any single char (except newline) | `a.c` matches "abc", "a@c" |
| **`\d`** | Any Digit `[0-9]` | Finding OTPs: `\d\d\d\d` |
| **`\w`** | Word char `(a-z, A-Z, 0-9, _)` | Usernames: `user_\w\w` |
| **`\s`** | Whitespace (space, tab, newline) | Finding gaps between words. |
| **`[A-Z]`**| Any Uppercase Letter | Validating Initials. |
| **`[a-z]`**| Any Lowercase Letter | Validating lowercase inputs. |

### B. Quantifiers (Repetition)

| Symbol | Meaning | Real Life Example |
| :--- | :--- | :--- |
| **`*`** | **Zero** or more times. | `ab*` matches "a", "abbb" |
| **`+`** | **One** or more times. | `\d+` matches "1", "123" |
| **`?`** | **Zero** or **One** time (Optional). | `https?` matches http/https |
| **`{n}`** | Exactly **n** times. | PIN Code: `\d{6}` |
| **`{n,m}`**| Between **n** and **m** times. | Password len: `\w{8,15}` |

### C. Logical Operators
*   `|` **(OR Operator):** Matches one pattern OR another.
    *   *Example:* `(com|org|net)` → Matches domain extensions.
*   `()` **(Grouping):** Groups characters to apply operators together.

---

## 5. Common Validation Examples

### 1. Mobile Number Validation (Indian)
*   **Rule:** Starts with 6, 7, 8, or 9, followed by 9 digits.
*   **Regex:** `[6-9][0-9]{9}`
*   **Explanation:**
    *   `[6-9]`: First digit must be 6, 7, 8, or 9.
    *   `[0-9]{9}`: Next 9 characters must be digits.

### 2. Email Validation (Simplified)
*   **Rule:** text + @ + text + . + text
*   **Regex:** `[a-zA-Z0-9._]+@[a-z]+\.[a-z]{2,3}`

### 3. Extracting Numbers from Text
*   **Input Text:** "Order ID: 12345, Amount: $500"
*   **Regex:** `\d+`
*   **Result:** Matches "12345" and "500".

---

## 6. Interesting Facts & Tricky Questions

### 💡 Fact 1: String Methods Use Regex Internally
Methods like `String.split()`, `String.matches()`, and `String.replaceAll()` actually compile a Regex Pattern internally!
*   *Example:* `str.split(",")` compiles `,` into a pattern behind the scenes.

### 💡 Fact 2: Performance Cost
`Pattern.compile()` is an expensive operation (CPU heavy).
*   **Tip:** Don't compile patterns inside a loop. Compile it once as a `static` constant and reuse it.

### 🔥 Interview Questions

**Q1: What is the difference between `*` and `+`?**
> *   `*` allows **Empty Strings** (0 occurrences).
> *   `+` requires **At least one character**.
> *   *Example on input "A":* `B*` matches (Zero occurrences of B found). `B+` fails (No B found).

**Q2: Greedy vs. Reluctant Quantifiers (Advanced)**
> *   **Greedy (`.*`)**: Eats as much as possible.
>     *   Input: `<div>text</div>` | Pattern: `<.*>` | Result: Matches the **whole line**.
> *   **Reluctant / Lazy (`.*?`)**: Eats as little as possible.
>     *   Input: `<div>text</div>` | Pattern: `<.*?>` | Result: Matches `<div>` then `</div>` separately.

**Q3: How to match a literal dot `.`?**
> Since `.` is a special symbol (meaning "any character"), you must escape it to match an actual dot.
> *   **Regex:** `\.`
> *   **Java Syntax:** `\\.`
```