# Assembler-in-Java
An application that works like an assembler
Assembler 2.0

Assembler 2.0 is a program that mimics the action of an assembler. It is programmed using using Java. It reads the assembly code from a text file ("input.txt") located in the directory of the application file and convert it into machine level code which can be understood by the machine. It makes two passes through the assembly code, hence it is a two pass assembler. The assembler is assumed to work on a machine that supports the following instructions in its instruction set architecture. 
 
It uses 4 bits to store opcode and 8 bits to store operand of the instructions. 
In the first pass, it searches for all the symbol in the file and then create a table for it. In the second pass, it uses instruction table and assembler directive table to complete the symbol table. The program also displays the symbol table and Opcode Table generated during the process to the user. The object code is obtained by mapping symbols and labels to binary codes. The object code is then written on a text file ( "output.txt" )
Error Handling:
⦁	When the input file is not present in the directory of the application file then instead of terminating the program abruptly, a message is shown to the user that the the input file is missing.
⦁	If the input file is corrupted, a message "cannot read file" is displayed to user.
⦁	When there is some token in the assembly program that cannot be identified by the program, a message is given to the user saying "token is not identified".
⦁	If any symbol in the assembly program is not identified by the architecture, a message "unidentified symbol" is displayed.
⦁	If any symbol in the assembly program is not identified by the architecture, a message "unidentified assembler directive" is displayed.

 
                                                                      								-By Nikhil Yadav
													
