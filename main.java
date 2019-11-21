public class main {

    public static void main(String[] args){
        //Test program consists of a hash table with a person's name as the key
        //and their age as the value
        LinearProbingHashTable<Object, Object> nameTable = new LinearProbingHashTable<>();

        //inserts a name and calls toString to show it has been inserted
        nameTable.insert("Adam", 54);
        System.out.println(nameTable.toString());

        //outputs 'false' because it is a duplicate
        boolean duplicate = nameTable.insert("Adam", 54);
        System.out.println(duplicate + "\n");

        //deletes a name and lists it as deleted in toString
        nameTable.delete("Adam");
        System.out.println(nameTable.toString());


        //outputs 'false' because the key is not found
        boolean notDeleted = nameTable.delete("Kobe");
        System.out.println(notDeleted + "\n");

        //adds more names to show re-probing after table gets half full
        nameTable.insert("Kevin", 15);
        nameTable.insert("John", 23);

        //since Adam was deleted, it is not hashed into the new table
        System.out.println(nameTable.toString());

        //returns value for a key
        System.out.println(nameTable.find("Kevin"));

        //returns hash value of a key
        System.out.println(nameTable.getHashValue("John"));

        //Demonstrates linear probing, since an identical name would create the
        //same hash value
        nameTable.insert("John", 19);
        System.out.println("\n" + nameTable.toString());

        //returns location
        System.out.println(nameTable.getLocation("John"));



    }
}
