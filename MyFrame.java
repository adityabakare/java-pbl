import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

class MyFrame 
	extends JFrame 
	implements ActionListener { 

	// Components of the Form 
	private Container c; 
	private JLabel title; 
	private JLabel name; 
	private JTextField tname; 
	private JLabel mno; 
	private JTextField tmno; 
	private JLabel gender; 
	private JRadioButton male; 
	private JRadioButton female; 
	private ButtonGroup gengp; 
	private JLabel dob; 
	private JComboBox date; 
	private JComboBox month; 
	private JComboBox year; 
	private JLabel add; 
	private JTextArea tadd; 
	private JCheckBox term; 
	private JButton sub; 
	private JButton reset;  
	private JLabel res;  
	private JLabel ctype;
	private JComboBox type;
	private JLabel stype;
	private JComboBox type2;
	private JLabel adhaar;
	private JTextField tadhaar;
	private JLabel town;
	private JTextField ttown;
	private JLabel state;
	private JTextField tstate;
	private JLabel qualif;
	private JComboBox jqualif;
	private JLabel land;
	private JComboBox tland;
	private JLabel language;
	private JCheckBox lang1;
	private JCheckBox lang2;
	private JCheckBox lang3;
	private JLabel experience;
	private JTextArea texp;
	private JLabel details;
	
	private String holding[]
	    = { "Less than 1 Hectare" , "1 to 2 Hectares" , 
	        "More than 2 Hectares" , "Landless" };
	
    private String types[]
        = { "Food Grains" , "Cash Crops" , 
            "Plantation Crops" , 
            "Horticulture Crops" };

    private String types2[]
        = { "Sandy Soil" , "Clayey Soil" , 
            "Loamy Soil" , "Red Soil" ,
            "Black Soil" };
            
    private String qualification[]
        = { "Illiterate" , "Semi-Literate" ,
            "10th or 12th pass" , "Graduate" };
            
	private String dates[] 
		= { "1", "2", "3", "4", "5", 
			"6", "7", "8", "9", "10", 
			"11", "12", "13", "14", "15", 
			"16", "17", "18", "19", "20", 
			"21", "22", "23", "24", "25", 
			"26", "27", "28", "29", "30", 
			"31" }; 
			
	private String months[] 
		= { "Jan", "feb", "Mar", "Apr", 
			"May", "Jun", "July", "Aug", 
			"Sup", "Oct", "Nov", "Dec" }; 
			
	private String years[] 
		= { "1995", "1996", "1997", "1998", 
			"1999", "2000", "2001", "2002", 
			"2003", "2004", "2005", "2006", 
			"2007", "2008", "2009", "2010", 
			"2011", "2012", "2013", "2014", 
			"2015", "2016", "2017", "2018", 
			"2019" }; 

	// constructor, to initialize the components 
	// with default values. 
	public MyFrame() 
	{ 
		setTitle("Registration Form"); 
		setBounds(300, 90, 900, 600); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setResizable(false); 

		c = getContentPane(); 
		c.setLayout(null); 

		title = new JLabel("Registration Form"); 
		title.setFont(new Font("Times New Roman", Font.PLAIN, 25)); 
		title.setSize(300, 30); 
		title.setLocation(330, 30); 
		c.add(title); 

		name = new JLabel("Name"); 
		name.setFont(new Font("Arial", Font.PLAIN, 15)); 
		name.setSize(70, 20); 
		name.setLocation(100, 100); 
		c.add(name); 

		tname = new JTextField(); 
		tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tname.setSize(190, 20); 
		tname.setLocation(200, 100); 
		c.add(tname); 

		mno = new JLabel("Mobile"); 
		mno.setFont(new Font("Arial", Font.PLAIN, 15)); 
		mno.setSize(70, 20); 
		mno.setLocation(100, 150); 
		c.add(mno); 

		tmno = new JTextField(); 
		tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tmno.setSize(150, 20); 
		tmno.setLocation(200, 150); 
		c.add(tmno); 

		gender = new JLabel("Gender"); 
		gender.setFont(new Font("Arial", Font.PLAIN, 15)); 
		gender.setSize(70, 20); 
		gender.setLocation(100, 200); 
		c.add(gender); 

		male = new JRadioButton("Male"); 
		male.setFont(new Font("Arial", Font.PLAIN, 12)); 
		male.setSelected(true); 
		male.setSize(60, 20); 
		male.setLocation(200, 200); 
		c.add(male); 

		female = new JRadioButton("Female"); 
		female.setFont(new Font("Arial", Font.PLAIN, 12)); 
		female.setSelected(false); 
		female.setSize(100, 20); 
		female.setLocation(270, 200); 
		c.add(female); 

		gengp = new ButtonGroup(); 
		gengp.add(male); 
		gengp.add(female); 

		dob = new JLabel("DOB"); 
		dob.setFont(new Font("Arial", Font.PLAIN, 15)); 
		dob.setSize(70, 20); 
		dob.setLocation(100, 250); 
		c.add(dob); 

		date = new JComboBox(dates); 
		date.setFont(new Font("Arial", Font.PLAIN, 12)); 
		date.setSize(50, 20); 
		date.setLocation(200, 250); 
		c.add(date); 

		month = new JComboBox(months); 
		month.setFont(new Font("Arial", Font.PLAIN, 12)); 
		month.setSize(50, 20); 
		month.setLocation(250, 250); 
		c.add(month); 

		year = new JComboBox(years); 
		year.setFont(new Font("Arial", Font.PLAIN, 12)); 
		year.setSize(60, 20); 
		year.setLocation(300, 250); 
		c.add(year); 

		add = new JLabel("Address"); 
		add.setFont(new Font("Arial", Font.PLAIN, 15)); 
		add.setSize(100, 20); 
		add.setLocation(100, 300); 
		c.add(add); 

		tadd = new JTextArea(); 
		tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tadd.setSize(170, 75); 
		tadd.setLocation(200, 300); 
		tadd.setLineWrap(true); 
		c.add(tadd); 
		
		ctype = new JLabel("Crop Type"); 
		ctype.setFont(new Font("Arial", Font.PLAIN, 15)); 
		ctype.setSize(100, 20); 
		ctype.setLocation(100, 400); 
		c.add(ctype); 

		type = new JComboBox(types); 
		type.setFont(new Font("Arial", Font.PLAIN, 12)); 
		type.setSize(150, 20); 
		type.setLocation(200, 400); 
		c.add(type);
		
		stype = new JLabel("Soil Type"); 
		stype.setFont(new Font("Arial", Font.PLAIN, 15)); 
		stype.setSize(100, 20); 
		stype.setLocation(100, 450); 
		c.add(stype); 

		type2 = new JComboBox(types2); 
		type2.setFont(new Font("Arial", Font.PLAIN, 12)); 
		type2.setSize(150, 20); 
		type2.setLocation(200, 450); 
		c.add(type2);

		term = new JCheckBox("Accept Terms And Conditions."); 
		term.setFont(new Font("Arial", Font.PLAIN, 13)); 
		term.setSize(250, 20); 
		term.setLocation(320, 490); 
		c.add(term); 

		sub = new JButton("Submit"); 
		sub.setFont(new Font("Arial", Font.PLAIN, 13)); 
		sub.setSize(100, 20); 
		sub.setLocation(310, 520); 
		sub.addActionListener(this); 
		c.add(sub); 

		reset = new JButton("Reset"); 
		reset.setFont(new Font("Arial", Font.PLAIN, 13)); 
		reset.setSize(100, 20); 
		reset.setLocation(430, 520); 
		reset.addActionListener(this); 
		c.add(reset);  
		
		adhaar = new JLabel("Adhaar Number"); 
		adhaar.setFont(new Font("Arial", Font.PLAIN, 15)); 
		adhaar.setSize(250, 20); 
		adhaar.setLocation(470, 100); 
		c.add(adhaar); 

		tadhaar = new JTextField(); 
		tadhaar.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tadhaar.setSize(155, 20); 
		tadhaar.setLocation(600, 100); 
		c.add(tadhaar);
		
		town = new JLabel("Village/Town"); 
		town.setFont(new Font("Arial", Font.PLAIN, 15)); 
		town.setSize(250, 20); 
		town.setLocation(470, 150); 
		c.add(town); 

		ttown = new JTextField(); 
		ttown.setFont(new Font("Arial", Font.PLAIN, 15)); 
		ttown.setSize(155, 20); 
		ttown.setLocation(600, 150); 
		c.add(ttown);
		
		state = new JLabel("State"); 
		state.setFont(new Font("Arial", Font.PLAIN, 15)); 
		state.setSize(250, 20); 
		state.setLocation(470, 200); 
		c.add(state); 

		tstate = new JTextField(); 
		tstate.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tstate.setSize(155, 20); 
		tstate.setLocation(600, 200); 
		c.add(tstate);
		
		qualif = new JLabel("Qualification"); 
		qualif.setFont(new Font("Arial", Font.PLAIN, 15)); 
		qualif.setSize(150, 20); 
		qualif.setLocation(470, 250); 
		c.add(qualif); 

		jqualif = new JComboBox(qualification); 
		jqualif.setFont(new Font("Arial", Font.PLAIN, 12)); 
		jqualif.setSize(150, 20); 
		jqualif.setLocation(600, 250); 
		c.add(jqualif);
		
		land = new JLabel("Land Holding"); 
		land.setFont(new Font("Arial", Font.PLAIN, 15)); 
		land.setSize(150, 20); 
		land.setLocation(470, 300); 
		c.add(land); 

		tland = new JComboBox(holding); 
		tland.setFont(new Font("Arial", Font.PLAIN, 12)); 
		tland.setSize(150, 20); 
		tland.setLocation(600, 300); 
		c.add(tland);
		
		language = new JLabel("Languages"); 
		language.setFont(new Font("Arial", Font.PLAIN, 15)); 
		language.setSize(200, 25); 
		language.setLocation(470, 350); 
		c.add(language);
		
		lang1 = new JCheckBox("English"); 
		lang1.setFont(new Font("Arial", Font.PLAIN, 13)); 
		lang1.setSize(70, 20); 
		lang1.setLocation(590, 350); 
		c.add(lang1); 
		
		lang2 = new JCheckBox("Hindi"); 
		lang2.setFont(new Font("Arial", Font.PLAIN, 13)); 
		lang2.setSize(70, 20); 
		lang2.setLocation(680, 350); 
		c.add(lang2); 
		
		lang3 = new JCheckBox("Marathi"); 
		lang3.setFont(new Font("Arial", Font.PLAIN, 13)); 
		lang3.setSize(70, 20); 
		lang3.setLocation(750, 350); 
		c.add(lang3); 
		
		experience = new JLabel("Previous Farming"); 
		experience.setFont(new Font("Arial", Font.PLAIN, 15)); 
		experience.setSize(150, 20); 
		experience.setLocation(470, 400); 
		c.add(experience); 
		
		details = new JLabel("Details (if any)"); 
		details.setFont(new Font("Arial", Font.PLAIN, 15)); 
		details.setSize(150, 20); 
		details.setLocation(480, 420); 
		c.add(details); 

		texp = new JTextArea(); 
		texp.setFont(new Font("Arial", Font.PLAIN, 15)); 
		texp.setSize(170, 75); 
		texp.setLocation(600, 400); 
		texp.setLineWrap(true); 
		c.add(texp); 
		
		res = new JLabel(""); 
		res.setFont(new Font("Arial", Font.PLAIN, 11)); 
		res.setSize(500, 25); 
		res.setLocation(440, 540); 
		c.add(res);


		setVisible(true); 
	} 

	// method actionPerformed() 
	// to get the action performed 
	// by the user and act accordingly 
	public void actionPerformed(ActionEvent e) 
	{ 
		if (e.getSource() == sub) { 
			if (term.isSelected()) { 
				res.setText("Registration Successful.."); 
			} 
			else {  
				res.setText("Please accept the"
							+ " terms & conditions.."); 
			} 
		} 

		else if (e.getSource() == reset) { 
			String def = ""; 
			tname.setText(def); 
			tadd.setText(def); 
			tmno.setText(def); 
			res.setText(def);  
			term.setSelected(false); 
			date.setSelectedIndex(0); 
			month.setSelectedIndex(0); 
			year.setSelectedIndex(0); 
			
		} 
	} 
} 

// Driver Code 
class Registration { 

	public static void main(String[] args) throws Exception 
	{ 
		MyFrame f = new MyFrame(); 
	} 
} 
