# assignDP

The Design Patterns used in the Project are and the classes included in each pattern:

1. Facade -> (Main, Facade, Login, MeatProductMenu, ProduceProductMenu etc)
2. Iterator -> (OfferingList, ClassProductList, ListIterator, OfferingIterator, ProductIterator)
3. Visitor -> (NodeVistor, ReminderVisitor, ClassProductList, Trading)
4. Factory -> (Person, Buyer, Seller, ProductMenu, MeatProductMenu, ProduceProductMenu)
5. Bridge -> (Person, Buyer, Seller, ProductMenu, MeatProductMenu, ProduceProductMenu)

Download the project from GitHub all the class files are in src.

Steps of Execution:

1. Open the Project in IntelliJ IDE
2. Run the Main.java Class File.
3. GUI Opens with the Login Screen.
4. Please Check the Console of IntelliJ IDE and GUI Paralelly using split screen on desktop.
5. Console shows Facade Pattern as the Facade workflow implementation is started.
5. Enter the Credentials, Select the userType and click Login. (If Wrong credentials -> Invalid Credentials is displayed)
6. Once the user is validated, The OfferingList is Iterated using the Iterator Pattern and shows the all the Offerings (both Produce and Meat products are shown) in the console.
7. The GUI shows the option to select the Menutype(eg: Produce products or Meat Products) tradings of the validated user.
8. Select the Menu Type and click submit and the Corresponding products are displayed on UI.
9. Console shows the Factory Pattern Execution as the objects of MeatProductMent and ProduceProductMenu are created by the Buyer and Seller classes i,e, they objects are created using Factory(Buyer, Seller) Method.
10. Further, Bridge Pattern is shown on the console as the Bridge pattern is used to show the Menu using the created objects of MeatProductMenu and ProduceProducetMenu using Factory Menthod.
11. Thereafter, Visitor Pattern is shown on the console and displays all the MenuType products that has tradings by the validated user as the visitor visits all Tradings Object and implements function correspondingly..
12. Therefore, This completes the Implementation and Execution of all the Design Patterns.


NOTE: Please check console and GUI parallely while execution.