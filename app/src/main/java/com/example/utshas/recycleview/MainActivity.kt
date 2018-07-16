package com.example.utshas.recycleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val animals: ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Loads animals into the ArrayList
        addAnimals()

        // Creates a vertical Layout Manager
        rv_animal_list.layoutManager = LinearLayoutManager(this)

        // You can use GridLayoutManager if you want multiple columns. Enter the number of columns as a parameter.
//        rv_animal_list.layoutManager = GridLayoutManager(this, 2)

        // Access the RecyclerView Adapter and load the data into it
        val animalType = arrayListOf<String>("bird","beast","domestic","others")
        rv_animal_list.adapter = AnimalAdapter(animals, animalType, this)
    }

    fun addAnimals() {
        animals.add("owl")
        animals.add("penguin")
        animals.add("parrot")
        animals.add("goose")
        animals.add("cheetah")
        animals.add("elephant")
        animals.add("raccoon")
        animals.add("bear")
        animals.add("lion")
        animals.add("tiger")
        animals.add("dog")
        animals.add("cat")
        animals.add("cow")
        animals.add("horse")
        animals.add("buffalo")
        animals.add("beaver")
        animals.add("bison")
        animals.add("frog")
        animals.add("fish")
        animals.add("shark")
        animals.add("turtle")
        animals.add("porcupine")
        animals.add("mouse")
        animals.add("deer")
        animals.add("snake")
        animals.add("lizard")
        animals.add("hamster")
        animals.add("fox")
        animals.add("moose")
        animals.add("monkey")
    }
}