Output Yes if the given combination of characters and lower-case word could be typed with the buttons from a single row of a standard US QWERTY keyboard(for example salad), No otherwise.

Consider that each character from word is typed only with a single button press, so characters from combination of buttons are not included like '$' = shift + '4'

Keyboard layout to assume:
Row 0: `1234567890-=
Row 1: qwertyuiop[]\
Row 2: asdfghjkl;'
Row 3: zxcvbnm,./

## I/O
Input
Line 1: word to check
Output
A single line Yes or No

##Constraints
0 < Length of word ≤ 128
Example
Input
`salad`
Output
`Yes`

