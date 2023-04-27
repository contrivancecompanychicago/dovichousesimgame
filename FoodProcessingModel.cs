using UnityEngine;

public class FoodProcessingModel : MonoBehaviour {

    public GameObject[] Ingredients;
    public GameObject[] Products;

    public void OnEnable() {
        // Initialize the ingredients and products.
        for (int i = 0; i < Ingredients.Length; i++) {
            Ingredients[i].GetComponent<Renderer>().enabled = false;
        }
        for (int i = 0; i < Products.Length; i++) {
            Products[i].GetComponent<Renderer>().enabled = false;
        }
    }

    public void ProcessIngredients() {
        // Check if there are any ingredients available.
        if (Ingredients.Length == 0) {
            return;
        }

        // Select a random ingredient.
        int randomIndex = UnityEngine.Random.Range(0, Ingredients.Length);
        GameObject ingredient = Ingredients[randomIndex];

        // Check if the ingredient is a valid ingredient.
        if (ingredient == null) {
            return;
        }

        // Get the type of the ingredient.
        Type ingredientType = ingredient.GetType();

        // Create a new product of the same type as the ingredient.
        GameObject product = Instantiate(ingredientType);

        // Add the product to the list of products.
        Products.Add(product);

        // Disable the ingredient.
        ingredient.GetComponent<Renderer>().enabled = false;
    }
}
