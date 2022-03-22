package com.example.androidquiz.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androidquiz.model.Question

class GameViewModel:ViewModel() {
    val questions= MutableLiveData<List<Question>>()
    //var autQuestion= Math.min((questions.size + 1 )/ 2,3)
   // var autQuestion= Math.min(questions.size)
    //val questions: MutableList<Question> = mutableListOf(
    fun refresh(){
      val question1= Question(" What is android jetpack?", listOf("all of these","tools","documentation","libraries"))
        val question2=  Question("Base class for layout?", listOf("ViewGroup","ViewSet","ViewCollection","ViewRoot"))
        val question3=Question("Layout for complex Screens", listOf("Constraint Layout","GridLayout","LinearLayout","FrameLayout"))
        val question4= Question("pushing structured data into a layout?",
        listOf("DataBinding","Data Pushing","Set Text", " On Click"))
        val question5= Question("Build system for Android?", listOf(
            "Gradle","Graddle","Grodle","Groyle"
        ))
        val question6=  Question("Android vector format?", listOf("Vector Drawable","AndroidVector Drawable","Drawable Vector","Res Drawable"))
        val question7= Question("Android navigation Component",
        listOf("NavController","NavCentral","navMaster,NavSwicher"))
        val question8= Question("Register app with launcher", listOf("intent-filter","app registry","launcher- resgistory","app-launcher"))
        val question9= Question("Mark a layout for dataBinding",listOf("<layout>","<binding>","<dataBinding","<dBinding>"))
val questionList= arrayListOf<Question>(question1,question2,question3,question4,question5,question6,question7,question8,question9)
        questions.value=questionList
    }
}