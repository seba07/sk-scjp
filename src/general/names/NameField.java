package general.names;


/**
 * 
 * Names are called IDENTIFIERS.
 * 
 * - names convention
 * - no keywords as identifiers
 * 
 * 
 * 
 * @author Sebastian Karsznia
 *
 */
public class NameField {

	/* Can start from letter */
	int startFromLetter;
	
	/* Can start from currency */
	int $startFromCurrency;
	
	/* Can start from currency */
	int _startFromUnderscore;
	
	
	/* Can NOT start from number! */
//	int 1startFromUnderscore;
	
	/* Java indentifier is CASE SENSITIVE */
	int one;
	/* not same as: */
	int ONE;
	
	/* Keyword can NOT be an identifier. */
//	int int;
	
	/* Also illegal! */
//	int :b;
//	int -d;
//	int e#;
//	int .f;
//	int 7g;
	
	
}





