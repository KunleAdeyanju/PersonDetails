package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        StringBuilder n = new StringBuilder(result);
        StringBuilder representationPerson = new StringBuilder();

        // while `counter` is less than length of array
            // begin loop
        while(counter < personArray.length){
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            representationPerson.append(String.valueOf(personArray[counter]));

            // append `stringRepresentation` to `result` variable
            //n.append(representationPerson);
            counter++;
        }// end loop

        //System.out.println(representationPerson);


        //return n.toString();
        return representationPerson.toString();
    }



    public String forLoop() {
        StringBuilder result = new StringBuilder();
        // identify initial value

        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
        for(int i =0; i < personArray.length; i++){
            // use `counter` to identify the `current Person` in the array
            result.append(String.valueOf(personArray[i]));
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
        }

            // end loop

        return result.toString();
    }



    public String forEachLoop() {
        StringBuilder result = new StringBuilder();
        // identify array's type
        // identify array's variable-name
        for(Person s: personArray) {
            // use the above discoveries to declare for-each-loop signature
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result.append(s);

        }
            // end loop

        // System.out.println(result);

        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
