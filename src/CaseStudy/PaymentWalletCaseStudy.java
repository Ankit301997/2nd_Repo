package CaseStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
		class Wallet
		{
			private String Fname;
			private String Lname;
			private String AccNo;
			private String Password;
			private int Amt;

			public Wallet(String Fname,String Lname,String AccNo,String Password)
			{
				this.Fname=Fname;
				this.Lname=Lname;
				this.AccNo=AccNo;
				this.Password=Password;
				this.Amt=0;	
			}

			public String getFname()
			{
				return this.Fname;
			}
			public void setFname(String Fname)
			{
				this.Fname=Fname;
			}


			public String getLname()
			{
				return this.Lname;
			}
			public void setLname(String Lname)
			{
				this.Lname=Lname;
			}


			public String getAccNo()
			{
				return this.AccNo;
			}
			public void setAccNo(String AccNo)
			{
				this.AccNo=AccNo;
			}

			public String getPassword()
			{
				return this.Password;
			}
			public void setPassword(String Password)
			{
				this.Password=Password;
			}

			public int getAmt()
			{
				return this.Amt;
			}
			public void setAmt(int Amt)
			{
				this.Amt=Amt;
			}

		}

		public class PaymentWalletCaseStudy {
			static List<Wallet> wdb=new ArrayList<Wallet>();
			static Scanner sc1;
			static String reqaccNum="";
			static String reqpass="";


			public static void main(String[] args) {

				int opt=0;

				do 
				{
					sc1=new Scanner(System.in);
					System.out.println("Menu: \n1.Create Account \n2.Log in  \n3.Show Account  \n4.Add Amount \n5.Transfer Fund \n6.Log out \n7.Exit ");
					try {
						opt=sc1.nextInt();
					}catch(Exception e)	{}

					if(opt==1)
					{
						boolean validCheck=true;
						Wallet w=createAccount();

						if(w.getAccNo().trim().equals(""))
						{
							System.out.println("--Error--\nPleaes enter valid account number");
							validCheck=false;
						}
						else if(w.getAccNo().trim().length()!=10)
						{
							System.out.println("--Error--\nPlease enter 10 digit account number");
							validCheck=false;
						}
						else if(!Pattern.matches("[0-9]+", w.getAccNo()))
						{
							System.out.println("--Error--\nPlease enter only number for Account#");
							validCheck=false;
						}

						if(w.getFname().trim().equals(""))
						{
							System.out.println("--Error--\nEnter valid First name");
							validCheck=false;
						}
						if(w.getLname().trim().equals(""))
						{
							System.out.println("--Error--\nEnter valid Last name");
							validCheck=false;
						}

						String regex = "^(?=.*[0-9])"
								+ "(?=.*[a-z])(?=.*[A-Z])"
								+ "(?=.*[@#$%^&+=])"
								+ "(?=\\S+$).{8,20}$";
						if(w.getPassword().trim().equals(""))
						{
							System.out.println("--Error--\nEnter valid password");
							validCheck=false;
						}
						else if(!Pattern.matches(regex, w.getPassword()))
						{
							System.out.println("--Error--\nPleaes follow Password rules \nDigit must occur at least once. \nLower case alphabet must occur at least once. \nUpper case alphabet that must occur at least once. \nSpecial character that must occur at least once. \nSpaces are not allowed in the Password. \nAt least 8 characters and at most 20 characters.");
							validCheck=false;
						}

						if(wdb.size()==0 && validCheck)
						{
							wdb.add(w);
							System.out.println("Account created successfully");
						}
						else if(validCheck)
						{
							String tACC=w.getAccNo();
							boolean createflag=true;

							for(int i=0;i<wdb.size();i++)
							{
								if(tACC.equals(wdb.get(i).getAccNo()))
								{
									createflag=false;
									break;
								}
							}
							if(createflag)
							{
								wdb.add(w);
								System.out.println("Account created successfully");
							}
							else
							{
								System.out.println("--Error--\nAccount Number already exists");
							}
						}
					}
					else if(opt==2)
					{
						logIn();
					}
					else if(opt==3)

					{
						showAccount();
					}
					else if (opt ==4)
					{
						addAmount();

					}
					else if(opt==5)
					{
						transferFund();


					}
					else if(opt==6)
					{
						logOut();
					}
					else if(opt==7)
					{
						System.out.println("Exit Wallet Application");
					}
					else
					{
						System.out.println("--Error--\nEnter correct option");
					}
				}while(opt!=7);
			}

			public static Wallet createAccount()
			{
				Wallet w=new Wallet(null, null, null, null);
				System.out.println("Enter your First Name");
				sc1=new Scanner(System.in);
				w.setFname(sc1.nextLine());
				System.out.println("Enter your Last Name");
				w.setLname(sc1.nextLine());
				System.out.println("Enter your Account Number(This must be your 10 digit phone number and can be used as your user id.)");
				w.setAccNo(sc1.nextLine());
				System.out.println("Enter your password");
				w.setPassword(sc1.nextLine());

				return w;
			}
			public static void logIn()
			{
				System.out.println("Enter your Account/Phone number/user id ");
				sc1=new Scanner(System.in);
				String accNo=sc1.nextLine();
				System.out.println("Enter your Password ");
				String pass=sc1.nextLine();
				if(wdb.size()==0)
				{
					System.out.println("--Error--\nInvalid credentials");
				}
				else
				{
					boolean loginflag =false;
					for(int i=0;i<wdb.size();i++)
					{
						if(accNo.equals(wdb.get(i).getAccNo())&& pass.equals(wdb.get(i).getPassword()))
						{
							loginflag=true;
							break;
						}
					}
					if(loginflag)
					{
						reqaccNum=accNo;
						reqpass=pass;
						System.out.println("Login Successful");
					}
					else
					{
						System.out.println("--Error--\nInvalid credentials");
					}
				}
			}
			public static void logOut() 
			{
				reqaccNum="";
				reqpass="";
				System.out.println("You are successfully logged out");
			}

			public static void addAmount()
			{
				if(!reqaccNum.equals("") && !reqpass.equals(""))
				{
					for(int i=0;i<wdb.size();i++)
					{
						if(reqaccNum.equals(wdb.get(i).getAccNo()))
						{
							try
							{
								System.out.println("Enter the Amount");
								int amt=sc1.nextInt();
								int netamt=wdb.get(i).getAmt()+amt;
								wdb.get(i).setAmt(netamt);
								System.out.println("Add amount successful");
							}
							catch(Exception e)
							{
								System.out.println("--Error--\nEnter Valid amount");
							}

						}
					}
				}
				else
				{
					System.out.println("--Error--\nPlease Login to add amount");
				}
			}
			public static void showAccount()
			{
				if(!reqaccNum.equals("") && !reqpass.equals(""))
				{
					for(int i=0;i<wdb.size();i++)
					{
						if(reqaccNum.equals(wdb.get(i).getAccNo()))
						{
							System.out.println("First Name :"+ wdb.get(i).getFname());
							System.out.println("Last Name :"+ wdb.get(i).getLname());
							System.out.println("Account Number :"+ wdb.get(i).getAccNo());
							System.out.println("Amount:"+ wdb.get(i).getAmt());
						}
					}

				}
				else
				{
					System.out.println("--Error--\nPlease Login to view acoount");
				}
			}

			public  static void transferFund()
			{
				sc1=new Scanner(System.in);
				if(!reqaccNum.equals("") && !reqpass.equals(""))
				{
					int srcAccindex=-1;
					String dAccno="";
					int amt=0;
					boolean amtCheck=false;
					for(int i=0;i<wdb.size();i++)
					{
						if(reqaccNum.equals(wdb.get(i).getAccNo()))
						{
							try
							{
								System.out.println("Enter the destination acccount number ");
								dAccno=sc1.nextLine();
								System.out.println("Enter the Amount to transfer");
								amt=sc1.nextInt();
								int actAmt=wdb.get(i).getAmt();
								if(actAmt>0 && actAmt>=amt)
								{
									int netamt=actAmt-amt;
									wdb.get(i).setAmt(netamt);
									srcAccindex=i;
									amtCheck=true;
									break;
								}
							}
							catch(Exception e)
							{
								System.out.println("--Error--\nEnter Valid amount/Account number");
							}

						}
					}
					if(amtCheck)
					{
						boolean dAccCheck=false;
						for(int i=0;i<wdb.size();i++)
						{
							if(dAccno.equals(wdb.get(i).getAccNo()))
							{
								try
								{
									int actAmt=wdb.get(i).getAmt();
									int netamt=actAmt+amt;
									wdb.get(i).setAmt(netamt);
									dAccCheck=true;
									break;
								}
								catch(Exception e)
								{
									System.out.println("--Error--\nUnknown Error in fund transfer ");
								}

							}
						}
						if(dAccCheck)
						{
							System.out.println("Fund Transfer Successful");
						}
						else
						{
							System.out.println("--Error--\nDestination Account is not found.");
							int actAmt=wdb.get(srcAccindex).getAmt();
							int netamt=actAmt+amt;
							wdb.get(srcAccindex).setAmt(netamt);
						}
					}
					else
					{
						System.out.println("--Error--\nFund transfer not successful/Insufficient fund");
					}
				}
				else
				{
					System.out.println("--Error--\nPlease Login to transfer the amount");
				}

			}

		}


