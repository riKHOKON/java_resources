/*
* Help class up to chapter 4
* */
package schildt_proj.try_this.help_system;

class Help
{

	void helpOn(int what){
		switch (what){
			case '1':
				System.out.println("The if :\n");
				System.out.println("if(expression) \n\tstatement;");
				System.out.println("else \n\tstatement;");
				break;
			case '2':
				System.out.println("The switch : \n");
				System.out.println("switch(expression){");
				System.out.println("\tcase constant :");
				System.out.println("\t\tstatement;");
				System.out.println("\t\tbreak;");
				System.out.println("\tcase constant2 :");
				System.out.println("\t\tstatement;");
				System.out.println("\t\tbreak;");
				System.out.println("\tdefault :");
				System.out.println("\t\tstatement;");
				System.out.println("}");
				break;
			case '3':
				System.out.println("The for:\n");
				System.out.println("for(init; condition ; iteration)");
				System.out.println("Statements;");
				break;
			case '4':
				System.out.println("The while:\n");
				System.out.println("while(condition)statement;");
				break;
			case '5':
				System.out.println("The so-while:\n");
				System.out.println("do{\nstatements;\n}");
				System.out.println("while(condition);");
				break;
			case '6':
				System.out.println("The break:\n");
				System.out.println("break; or break label;");
				break;
			case '7':
				System.out.println("The continue:\n");
				System.out.println("continue; or continue label;");
				break;
			case '8':
				System.out.println("single dimensional array:");
				System.out.println("		type name[] = new type[size];");
				System.out.println("multi-dimensional array:");
				System.out.println("		type name[][][]..[] = new type[size1][size2][size3]...[sizeN];");
				System.out.println("alternative declaration way:");
				System.out.println("		type[][] name = new type[size1][size2];");
				break;
			case '9':
				System.out.println("The for each style loop:");
				System.out.println("for(itr-var : collection){");
				System.out.println("	statement1;"+"\n\tstatement2;");
				System.out.println("}");
				/*
			case '10':
				System.out.println();
				*/
		}
		System.out.println();
	}
	void showMenu(){
		//JOptionPane.showMessageDialog(null,"we are here! go to console...");
		System.out.println("Help on:");
		System.out.println("1.	if");
		System.out.println("2.	switch");
		System.out.println("3.	for");
		System.out.println("4.	while");
		System.out.println("5.	do-while");
		System.out.println("6.	break");
		System.out.println("7.	continue");
		System.out.println("8.	structure of arrays");
		System.out.println("9.	for each loop");
		System.out.println("10.	Overloading-definition");
		System.out.println("11.	Overriding-Definition");
		System.out.println("Choose one (q to quit.):");
	}
	boolean isValid(int ch){
		if (ch < '1' | ch > '9' & ch != 'q')return false;
		else return true;
	}
}