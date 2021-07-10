package com.nestor.gsonexpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.xml.sax.Parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Gson gson = new Gson(); // hacemos una instancia de GSON para poder aplicar el parseo

        /*//CONVETIR Objeto a JSON
        Animal animal = new Animal(1,"leon","terrestre", new String[]{"cazar","reinar"}); //Instanciamos nuestra clase "Animal" y asignamos valores en sus parametros
        String json = gson.toJson(animal); //Conversion de Objeto a JSON, cramos una variable tipo String y usamos nuestra instancia gson para parsear(convertir) dentro de los parentesis va el objeto que deseamos parsear

        Log.i("Gson", json); //esta de adorno para mostrarlo en el LogCat


        //CONVETIR JSON a Objeto
        String json = "{\"id\":1,\"animal\":\"leon\",\"especie\":\"terrestre\",\"habilidades\":[\"cazar\",\"reinar\"]}"; //Aqui se realiza la conversion de JSON a Objeto, se crea una variable tipo Sring y se ponen los datos que existen en el JSon (NOTA: Antes de cada (") va una barra invertida (\)
        Animal animal = gson.fromJson(json, Animal.class); //Conversion de JSON a Objeto, creamos la instancia del objeto a la que la vamos a mandar y con ayuda de la instancia de gson le decimos que vamos a cambiar de Json a objeto (fromJson(entre parentesis van 2 parametros, el primero es la cadena JSON que desamos convertir, y en el segundo va la clase (objeto) en la que lo guardaremos)

        */// -----------------------------------------------------------------------------------------

        // CONVERTIR UN ArrayList de Objeto a JSON
        List<Granja> granja = new ArrayList<>(); //creamos una instancia tipo lista de la clase "Granja"
        granja.add(new Granja("vaca",5));     //Registro 1 del List
        granja.add(new Granja("gallina", 1)); //Registro 2 del List

        String json = gson.toJson(granja); //Conversion de un Objeto List a JSON, creamos la variable donde guardaremos la cadena JSON  y con ayuda de la instancia antes creada de gson, le decimos que queremos convertir de objeto A JSON (el parametro es el objeto que deseamos parsear)


        // CONVERTIR UN ArrayList de JSON a Objeto
/*        String json = "[{\"animal\":\"vaca\",\"edad\":5},{\"animal\":\"gallina\",\"edad\":1}]"; //Creamos nuestra variable String, donde guardamos los datos del JSON
        Granja[] granja = gson.fromJson(json, Granja[].class); // opcion 1        //Instanciamos nuestro objetoArray y con la ayuda de la instancia gson, usamos la propiedad.fromJson que es desdeJSon y los parametros son, la variable JSON que deseamos parsear y declaramos la clase a donde queremos mandarla)

        Type GranjaType = new TypeToken<ArrayList<Granja>>(){}.getType(); // opcion2    //no le agarre muy bien el rollo :s
        ArrayList<Granja> granja = gson.fromJson(json, GranjaType);  // quiza es algo más protegido
*/
        Log.i("za", json);

        /*
        String json = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader("json_file.json"));

            String linea;
            while ((linea = br.readLine()) != null){
                json += linea;
            }

            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Log.i("Gson", json);
        */

        /* EJEMPLO UNO FALLIDO
            String JsonObjeto = utilidades.ObtenerJsonObjeto(getApplicationContext());
            Gson gson = new Gson();
            Animal objeto = gson.fromJson(JsonObjeto, Animal.class);

            Log.i("gson", "ID: " + objeto.getId());
            Log.i("gson", "Nombre: " + objeto.getNombre());
            Log.i("gson", "Tipo: " + objeto.getEspecie());
            Log.i("gson", "Habilidades: " + objeto.getHabilidades());

            String convertObjetctToString = gson.toJson(objeto);
        */
    }
}