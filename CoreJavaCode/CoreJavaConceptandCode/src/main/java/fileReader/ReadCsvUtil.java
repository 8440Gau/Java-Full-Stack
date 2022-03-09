package fileReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class ReadCsvUtil {
	
	private String  Userid;
	private String  EmployeeFirstName;	
	private String  EmployeeSurname;
	private String  EmployeeNumber;	
	private String EmployeeEmail;
	private String  PracticeCode;	
	private String  SectorName;	
	private String  People_Manager;	
	private String  PracticeManager;	
	private String  HRManager;
	private String  Enddateofemployment;
	private String IBAN;
	private String City;
	private String GGID;
	private String Grade;
	private String  Role_IN_Group1;	
	private String  Role_IN_Group2;	
	private String  Role_IN_Group3;	
	private String  Role_IN_Group4;	
	private String  Role_IN_Group5;	
	private String  Role_IN_Group6;	
	private String  Role_IN_Group7;	
	private String  Role_IN_Group8;	
	private String  Role_IN_Group9;	
	private String  Role_IN_Group10;	
	private String  Role_IN_Group11;	
	private String Entity;

	public String getUserid() {
		return Userid;
	}

	public void setUserid(String userid) {
		Userid = userid;
	}

	public String getEmployeeFirstName() {
		return EmployeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		EmployeeFirstName = employeeFirstName;
	}

	public String getEmployeeSurname() {
		return EmployeeSurname;
	}

	public void setEmployeeSurname(String employeeSurname) {
		EmployeeSurname = employeeSurname;
	}

	public String getEmployeeNumber() {
		return EmployeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		EmployeeNumber = employeeNumber;
	}

	public String getEmployeeEmail() {
		return EmployeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		EmployeeEmail = employeeEmail;
	}

	public String getPracticeCode() {
		return PracticeCode;
	}

	public void setPracticeCode(String practiceCode) {
		PracticeCode = practiceCode;
	}

	public String getSectorName() {
		return SectorName;
	}

	public void setSectorName(String sectorName) {
		SectorName = sectorName;
	}

	public String getPeople_Manager() {
		return People_Manager;
	}

	public void setPeople_Manager(String people_Manager) {
		People_Manager = people_Manager;
	}

	public String getPracticeManager() {
		return PracticeManager;
	}

	public void setPracticeManager(String practiceManager) {
		PracticeManager = practiceManager;
	}

	public String getHRManager() {
		return HRManager;
	}

	public void setHRManager(String hRManager) {
		HRManager = hRManager;
	}

	public String getEnddateofemployment() {
		return Enddateofemployment;
	}

	public void setEnddateofemployment(String enddateofemployment) {
		Enddateofemployment = enddateofemployment;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getGGID() {
		return GGID;
	}

	public void setGGID(String gGID) {
		GGID = gGID;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public String getRole_IN_Group1() {
		return Role_IN_Group1;
	}

	public void setRole_IN_Group1(String role_IN_Group1) {
		Role_IN_Group1 = role_IN_Group1;
	}

	public String getRole_IN_Group2() {
		return Role_IN_Group2;
	}

	public void setRole_IN_Group2(String role_IN_Group2) {
		Role_IN_Group2 = role_IN_Group2;
	}

	public String getRole_IN_Group3() {
		return Role_IN_Group3;
	}

	public void setRole_IN_Group3(String role_IN_Group3) {
		Role_IN_Group3 = role_IN_Group3;
	}

	public String getRole_IN_Group4() {
		return Role_IN_Group4;
	}

	public void setRole_IN_Group4(String role_IN_Group4) {
		Role_IN_Group4 = role_IN_Group4;
	}

	public String getRole_IN_Group5() {
		return Role_IN_Group5;
	}

	public void setRole_IN_Group5(String role_IN_Group5) {
		Role_IN_Group5 = role_IN_Group5;
	}

	public String getRole_IN_Group6() {
		return Role_IN_Group6;
	}

	public void setRole_IN_Group6(String role_IN_Group6) {
		Role_IN_Group6 = role_IN_Group6;
	}

	public String getRole_IN_Group7() {
		return Role_IN_Group7;
	}

	public void setRole_IN_Group7(String role_IN_Group7) {
		Role_IN_Group7 = role_IN_Group7;
	}

	public String getRole_IN_Group8() {
		return Role_IN_Group8;
	}

	public void setRole_IN_Group8(String role_IN_Group8) {
		Role_IN_Group8 = role_IN_Group8;
	}

	public String getRole_IN_Group9() {
		return Role_IN_Group9;
	}

	public void setRole_IN_Group9(String role_IN_Group9) {
		Role_IN_Group9 = role_IN_Group9;
	}

	public String getRole_IN_Group10() {
		return Role_IN_Group10;
	}

	public void setRole_IN_Group10(String role_IN_Group10) {
		Role_IN_Group10 = role_IN_Group10;
	}

	public String getRole_IN_Group11() {
		return Role_IN_Group11;
	}

	public void setRole_IN_Group11(String role_IN_Group11) {
		Role_IN_Group11 = role_IN_Group11;
	}

	public String getEntity() {
		return Entity;
	}

	public void setEntity(String entity) {
		Entity = entity;
	}


	@Override
	public String toString() {
		return "ReadCsvUtil [Userid=" + Userid + ", EmployeeFirstName=" + EmployeeFirstName + ", EmployeeSurname="
				+ EmployeeSurname + ", EmployeeNumber=" + EmployeeNumber + ", EmployeeEmail=" + EmployeeEmail
				+ ", PracticeCode=" + PracticeCode + ", SectorName=" + SectorName + ", People_Manager=" + People_Manager
				+ ", PracticeManager=" + PracticeManager + ", HRManager=" + HRManager + ", Enddateofemployment="
				+ Enddateofemployment + ", IBAN=" + IBAN + ", City=" + City + ", GGID=" + GGID + ", Grade=" + Grade
				+ ", Role_IN_Group1=" + Role_IN_Group1 + ", Role_IN_Group2=" + Role_IN_Group2 + ", Role_IN_Group3="
				+ Role_IN_Group3 + ", Role_IN_Group4=" + Role_IN_Group4 + ", Role_IN_Group5=" + Role_IN_Group5
				+ ", Role_IN_Group6=" + Role_IN_Group6 + ", Role_IN_Group7=" + Role_IN_Group7 + ", Role_IN_Group8="
				+ Role_IN_Group8 + ", Role_IN_Group9=" + Role_IN_Group9 + ", Role_IN_Group10=" + Role_IN_Group10
				+ ", Role_IN_Group11=" + Role_IN_Group11 + ", Entity=" + Entity + "]";
	}
	
	public static void main(String[] args) throws IOException {
		ReadCsvUtil rcv = new ReadCsvUtil();
		rcv.read();
	}

	private static final String SAMPLE_CSV_FILE_PATH = "D:/study/ImageNow/CSV FIle/CSV_Split_Demo/ImageNow_20200717074103.csv";
	 private static final String NEW_LINE_SEPARATOR = "\n";
	private static final Object [] FILE_HEADER = {"Entity","Employee First Name","Employee Surname","Employee Number","Employee Email","Practice Code","Sector Name","People Manager","Practice Manager","HR Manager","End date of employment","IBAN","City","GGID","Grade","Role/IN Group1","Role/IN Group2","Role/IN Group3","Role/IN Group4","Role/IN Group5","Role/IN Group6","Role/IN Group7","Role/IN Group8","Role/IN Group9","Role/IN Group10","Role/IN Group11","User ID"};;
	void read() throws IOException {
		
		
		
		List<ReadCsvUtil> list1 = new ArrayList<>();
		List<ReadCsvUtil> list2 = new ArrayList<>();
		//.withRecordSeparator(NEW_LINE_SEPARATOR)
		 Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH), StandardCharsets.ISO_8859_1);
         CSVParser csvParser = new CSVParser(reader, ReadCsvUtil.newFormat(';').withRecordSeparator(NEW_LINE_SEPARATOR).withHeader
        		 ("Entity","Employee First Name","Employee Surname","Employee Number","Employee Email","Practice Code","Sector Name","People Manager","Practice Manager","HR Manager","End date of employment","IBAN","City","GGID","Grade","Role/IN Group1","Role/IN Group2","Role/IN Group3","Role/IN Group4","Role/IN Group5","Role/IN Group6","Role/IN Group7","Role/IN Group8","Role/IN Group9","Role/IN Group10","Role/IN Group11","User ID"));
         
         List csvRecords = csvParser.getRecords(); 
         System.out.println("csvRecords.size() " + csvRecords.size());
         
         CSVParser csvParser2 = null ;
         List<String> l =csvParser.getHeaderNames();
         System.out.println(l);
      
         for (int i = 1; i < csvRecords.size(); i++) {
             CSVRecord record = (CSVRecord) csvRecords.get(i);
             
            System.out.println(record);
			  String splitter = record.get("Entity");
			  System.out.println("splitter  " +splitter);
			  
			  
			 if(splitter.equalsIgnoreCase("CGNLD")) {
				 System.out.println("Inside CGNLD");
				 ReadCsvUtil imgNow1 = new ReadCsvUtil();
				 
				 imgNow1.setUserid(record.get("User ID"));
	        	 imgNow1.setEmployeeFirstName(record.get("Employee First Name"));
	        	 imgNow1.setEmployeeSurname(record.get("Employee Surname"));
	        	 imgNow1.setEmployeeNumber(record.get("Employee Number"));
	        	 imgNow1.setEmployeeEmail(record.get("Employee Email"));
	        	 imgNow1.setPracticeCode(record.get("Practice Code"));
	        	 imgNow1.setSectorName(record.get("Sector Name"));
	        	 imgNow1.setPeople_Manager(record.get("People Manager"));  
	        	 imgNow1.setPracticeManager(record.get("Practice Manager"));
	        	 imgNow1.setHRManager(record.get("HR Manager"));
	        	 imgNow1.setEnddateofemployment(record.get("End date of employment"));
	        	 imgNow1.setIBAN(record.get("IBAN"));
	        	 imgNow1.setCity(record.get("City"));
	        	 imgNow1.setGGID(record.get("GGID"));
	        	 imgNow1.setGrade(record.get("Grade"));
	        	 imgNow1.setRole_IN_Group1(record.get("Role/IN Group1"));
	        	 imgNow1.setRole_IN_Group2(record.get("Role/IN Group2"));
	        	 imgNow1.setRole_IN_Group3(record.get("Role/IN Group3"));
	        	 imgNow1.setRole_IN_Group4(record.get("Role/IN Group4"));
	        	 imgNow1.setRole_IN_Group5(record.get("Role/IN Group5"));
	        	 imgNow1.setRole_IN_Group6(record.get("Role/IN Group6"));
	        	 imgNow1.setRole_IN_Group7(record.get("Role/IN Group7"));
	        	 imgNow1.setRole_IN_Group8(record.get("Role/IN Group8"));
	        	 imgNow1.setRole_IN_Group9(record.get("Role/IN Group9"));
	        	 imgNow1.setRole_IN_Group10(record.get("Role/IN Group10"));
	        	 imgNow1.setRole_IN_Group11(record.get("Role/IN Group11"));
	        	 imgNow1.setEntity(record.get("Entity"));	        	 
	        	 System.out.println("list1 " + list1);
	        	 list1.add(imgNow1);
			 
			  } else if(splitter.equalsIgnoreCase("SGNLD")) {
				  ReadCsvUtil imgNow1 = new ReadCsvUtil();
				  
				  
				  imgNow1.setUserid(record.get("User ID"));
		        	 imgNow1.setEmployeeFirstName(record.get("Employee First Name"));
		        	 imgNow1.setEmployeeSurname(record.get("Employee Surname"));
		        	 imgNow1.setEmployeeNumber(record.get("Employee Number"));
		        	 imgNow1.setEmployeeEmail(record.get("Employee Email"));
		        	 imgNow1.setPracticeCode(record.get("Practice Code"));
		        	 imgNow1.setSectorName(record.get("Sector Name"));
		        	 imgNow1.setPeople_Manager(record.get("People Manager"));  
		        	 imgNow1.setPracticeManager(record.get("Practice Manager"));
		        	 imgNow1.setHRManager(record.get("HR Manager"));
		        	 imgNow1.setEnddateofemployment(record.get("End date of employment"));
		        	 imgNow1.setIBAN(record.get("IBAN"));
		        	 imgNow1.setCity(record.get("City"));
		        	 imgNow1.setGGID(record.get("GGID"));
		        	 imgNow1.setGrade(record.get("Grade"));
		        	 imgNow1.setRole_IN_Group1(record.get("Role/IN Group1"));
		        	 imgNow1.setRole_IN_Group2(record.get("Role/IN Group2"));
		        	 imgNow1.setRole_IN_Group3(record.get("Role/IN Group3"));
		        	 imgNow1.setRole_IN_Group4(record.get("Role/IN Group4"));
		        	 imgNow1.setRole_IN_Group5(record.get("Role/IN Group5"));
		        	 imgNow1.setRole_IN_Group6(record.get("Role/IN Group6"));
		        	 imgNow1.setRole_IN_Group7(record.get("Role/IN Group7"));
		        	 imgNow1.setRole_IN_Group8(record.get("Role/IN Group8"));
		        	 imgNow1.setRole_IN_Group9(record.get("Role/IN Group9"));
		        	 imgNow1.setRole_IN_Group10(record.get("Role/IN Group10"));
		        	 imgNow1.setRole_IN_Group11(record.get("Role/IN Group11"));
		        	 imgNow1.setEntity(record.get("Entity"));
		        	 
		        	 
		        	 
		        	 list2.add(imgNow1);
			 }
			 
      
        
         }
     
         Map<String, List<ReadCsvUtil>> imgNowmpa = new HashMap<>();
         imgNowmpa.put("SGNLD", list2);
         imgNowmpa.put("CGNLD", list1);
         writeCSV(imgNowmpa);
         
         
         
	}
	
	@SuppressWarnings({ "unchecked", "resource" })
	void writeCSV(Map<String, List<ReadCsvUtil>> map) throws IOException {
		

		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
	    String strDate= formatter.format(date);  
	   // System.out.println(strDate);  
	    String CGNLD = "D:/study/ImageNow/CSV FIle/NewFileGenerate/CGNLD"+strDate+".csv";
	    String SGNLD = "D:/study/ImageNow/CSV FIle/NewFileGenerate/SGNLD"+strDate+".csv";
		
		
		FileWriter	 fileWriter1 = new FileWriter(SGNLD);
		FileWriter	 fileWriter2 = new FileWriter(CGNLD);
		CSVFormat csvFileFormat = CSVFormat.DEFAULT.withRecordSeparator(NEW_LINE_SEPARATOR);
		CSVPrinter csvFilePrinter1 = new CSVPrinter(fileWriter2, csvFileFormat);
		CSVPrinter csvFilePrinter2 = new CSVPrinter(fileWriter1, csvFileFormat);
		csvFilePrinter1.printRecord(FILE_HEADER);
		csvFilePrinter2.printRecord(FILE_HEADER);
		//csvFilePrinter1.printRecords(map.get("BE Employee"));
		//csvFilePrinter2.printRecords(map.get("BE Payroll Back Office"));
		for(ReadCsvUtil img: map.get("CGNLD")) {
			@SuppressWarnings("rawtypes")
			List imageNList = new ArrayList<>();
		//	System.out.println("img.getEmployeeFirstName() " + img.getEmployeeFirstName());
			imageNList.add(img.getEntity());
			imageNList.add(img.getEmployeeFirstName());
			imageNList.add(img.getEmployeeSurname());
			imageNList.add(img.getEmployeeNumber());
			imageNList.add(img.getEmployeeEmail());
			imageNList.add(img.getPracticeCode());
			imageNList.add(img.getSectorName());
			imageNList.add(img.getPeople_Manager());
			imageNList.add(img.getPracticeCode());
			imageNList.add(img.getHRManager());
			imageNList.add(img.getEnddateofemployment());
			imageNList.add(img.getIBAN());
			imageNList.add(img.getCity());
			imageNList.add(img.getGGID());
			imageNList.add(img.getGrade());
			imageNList.add(img.getRole_IN_Group1());
			imageNList.add(img.getRole_IN_Group2());
			imageNList.add(img.getRole_IN_Group3());
			imageNList.add(img.getRole_IN_Group4());
			imageNList.add(img.getRole_IN_Group5());
			imageNList.add(img.getRole_IN_Group6());
			imageNList.add(img.getRole_IN_Group7());
			imageNList.add(img.getRole_IN_Group8());
			imageNList.add(img.getRole_IN_Group9());
			imageNList.add(img.getRole_IN_Group10());
			imageNList.add(img.getRole_IN_Group11());
			imageNList.add(img.getUserid());
			csvFilePrinter1.printRecord(imageNList);
		}
		
		for(ReadCsvUtil img: map.get("SGNLD")) {
			@SuppressWarnings("rawtypes")
			List imageNList2 = new ArrayList<>();
			
			
			imageNList2.add(img.getEntity());
			imageNList2.add(img.getEmployeeFirstName());
			imageNList2.add(img.getEmployeeSurname());
			imageNList2.add(img.getEmployeeNumber());
			imageNList2.add(img.getEmployeeEmail());
			imageNList2.add(img.getPracticeCode());
			imageNList2.add(img.getSectorName());
			imageNList2.add(img.getPeople_Manager());
			imageNList2.add(img.getPracticeCode());
			imageNList2.add(img.getHRManager());
			imageNList2.add(img.getEnddateofemployment());
			imageNList2.add(img.getIBAN());
			imageNList2.add(img.getCity());
			imageNList2.add(img.getGGID());
			imageNList2.add(img.getGrade());
			imageNList2.add(img.getRole_IN_Group1());
			imageNList2.add(img.getRole_IN_Group2());
			imageNList2.add(img.getRole_IN_Group3());
			imageNList2.add(img.getRole_IN_Group4());
			imageNList2.add(img.getRole_IN_Group5());
			imageNList2.add(img.getRole_IN_Group6());
			imageNList2.add(img.getRole_IN_Group7());
			imageNList2.add(img.getRole_IN_Group8());
			imageNList2.add(img.getRole_IN_Group9());
			imageNList2.add(img.getRole_IN_Group10());
			imageNList2.add(img.getRole_IN_Group11());
			imageNList2.add(img.getUserid());
			
			csvFilePrinter2.printRecord(imageNList2);
		}
		
		fileWriter2.flush();
		fileWriter2.close();
		csvFilePrinter1.close();
		csvFilePrinter2.close();
	}	
	
	 public static CSVFormat newFormat(char delimiter) {
		return CSVFormat.newFormat(';');
    	 
     }
	

}
