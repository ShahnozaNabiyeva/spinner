package com.shahnoza.spinner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.shahnoza.spinner.adapter.Color
import com.shahnoza.spinner.adapter.MyAdapter
import com.shahnoza.spinner.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var myAdapter: MyAdapter
    lateinit var list: ArrayList<String>
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


            list=ArrayList()
            list.add("red")
            list.add("white")
            list.add("black")
            list.add("blue")
            list.add("yellow")
            list.add("green")


            myAdapter = MyAdapter(this,list,object :MyAdapter.MyClick{
                override fun clickMe(color: String, position: Int) {

                    when(color){
                       "white" -> {
                           Color.color = "white"
                           binding.main.setBackgroundColor(ContextCompat.getColor(this@MainActivity,R.color.white))
                       }

                        "black" -> {
                            Color.color = "black"
                            binding.main.setBackgroundColor(ContextCompat.getColor(this@MainActivity,R.color.black))
                        }

                        "red" -> {
                            Color.color = "red"
                            binding.main.setBackgroundColor(ContextCompat.getColor(this@MainActivity,R.color.red))
                        }

                        "blue" -> {
                            Color.color = "blue"
                            binding.main.setBackgroundColor(ContextCompat.getColor(this@MainActivity,R.color.blue))
                        }

                        "green" -> {
                            Color.color = "green"
                            binding.main.setBackgroundColor(ContextCompat.getColor(this@MainActivity,R.color.green))
                        }

                        "yellow" -> {
                            Color.color = "yellow"
                            binding.main.setBackgroundColor(ContextCompat.getColor(this@MainActivity,R.color.yellow))
                        }
                    }
                }

            })
            binding.spinner.adapter=myAdapter


    }

}