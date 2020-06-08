package mx.edu.ittepic.ladm_u5_practica2_emmanuelhuizar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.google.ar.sceneform.AnchorNode
import com.google.ar.sceneform.math.Vector3
import com.google.ar.sceneform.rendering.ModelRenderable
import com.google.ar.sceneform.rendering.ViewRenderable
import com.google.ar.sceneform.ux.ArFragment
import com.google.ar.sceneform.ux.TransformableNode
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var arrayView:Array<View>
    lateinit var bearRender:ModelRenderable
    lateinit var catRender:ModelRenderable
    lateinit var cowRender:ModelRenderable
    lateinit var dogRender:ModelRenderable
    lateinit var elephantRender:ModelRenderable
    lateinit var ferretRender:ModelRenderable
    lateinit var hippoRender:ModelRenderable
    lateinit var horseRender:ModelRenderable
    lateinit var koalaRender:ModelRenderable
    lateinit var lionRender:ModelRenderable
    lateinit var reindeerRender:ModelRenderable
    lateinit var wolverineRender:ModelRenderable

    internal var selected=1

    lateinit var arFragment: ArFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupArray()
        setupClikListener()
        setupModel()

        arFragment = supportFragmentManager.findFragmentById(R.id.scene_form_fragment) as ArFragment

        arFragment.setOnTapArPlaneListener { hitResult, plane, motionEvent ->
            val anchor = hitResult.createAnchor()
            val anchorNode=AnchorNode(anchor)
            anchorNode.setParent(arFragment.arSceneView.scene)
            createModel(anchorNode,selected)
        }
    }

    override fun onClick(view: View?) {
        if(view!!.id==R.id.bear){
            selected=1
            mySetBackground(view!!.id)
        }else{
            if(view!!.id==R.id.cat){
                selected=2
                mySetBackground(view!!.id)
            }else{
                if(view!!.id==R.id.cow){
                    selected=3
                    mySetBackground(view!!.id)
                }else{
                    if(view!!.id==R.id.dog){
                        selected=4
                        mySetBackground(view!!.id)
                    }else{
                        if(view!!.id==R.id.elephant){
                            selected=5
                            mySetBackground(view!!.id)
                        }else{
                            if(view!!.id==R.id.ferret){
                                selected=6
                                mySetBackground(view!!.id)
                            }else{
                                if(view!!.id==R.id.hippopotamus){
                                    selected=7
                                    mySetBackground(view!!.id)
                                }else{
                                    if(view!!.id==R.id.horse){
                                        selected=8
                                        mySetBackground(view!!.id)
                                    }else{
                                        if(view!!.id==R.id.koala_bear){
                                            selected=9
                                            mySetBackground(view!!.id)
                                        }else{
                                            if(view!!.id==R.id.lion){
                                                selected=10
                                                mySetBackground(view!!.id)
                                            }else{
                                                if(view!!.id==R.id.reindeer){
                                                    selected=11
                                                    mySetBackground(view!!.id)
                                                }else{
                                                    if(view!!.id==R.id.wolverine){
                                                        selected=12
                                                        mySetBackground(view!!.id)
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private fun mySetBackground(id: Int) {
        for(i in arrayView.indices){
            if(arrayView[i].id==id){
                arrayView[i].setBackgroundColor(Color.parseColor("#80333639"))
            }else{
                arrayView[i].setBackgroundColor(Color.TRANSPARENT)
            }
        }
    }

    private fun setupModel() {
        ModelRenderable.builder().setSource(this,R.raw.bear).build().thenAccept{modelRenderable -> bearRender = modelRenderable }
            .exceptionally { throwable ->  Toast.makeText(this@MainActivity,"Este es un oso",Toast.LENGTH_SHORT).show()
                null
            }
        ModelRenderable.builder().setSource(this,R.raw.cat).build().thenAccept{modelRenderable -> catRender = modelRenderable }
            .exceptionally { throwable ->  Toast.makeText(this@MainActivity,"Este es un gato",Toast.LENGTH_SHORT).show()
                null
            }
        ModelRenderable.builder().setSource(this,R.raw.cow).build().thenAccept{modelRenderable -> cowRender = modelRenderable }
            .exceptionally { throwable ->  Toast.makeText(this@MainActivity,"Este es un oso",Toast.LENGTH_SHORT).show()
                null
            }
        ModelRenderable.builder().setSource(this,R.raw.dog).build().thenAccept{modelRenderable -> dogRender = modelRenderable }
            .exceptionally { throwable ->  Toast.makeText(this@MainActivity,"Este es un oso",Toast.LENGTH_SHORT).show()
                null
            }
        ModelRenderable.builder().setSource(this,R.raw.elephant).build().thenAccept{modelRenderable -> elephantRender = modelRenderable }
            .exceptionally { throwable ->  Toast.makeText(this@MainActivity,"Este es un oso",Toast.LENGTH_SHORT).show()
                null
            }
        ModelRenderable.builder().setSource(this,R.raw.ferret).build().thenAccept{modelRenderable -> ferretRender = modelRenderable }
            .exceptionally { throwable ->  Toast.makeText(this@MainActivity,"Este es un oso",Toast.LENGTH_SHORT).show()
                null
            }
        ModelRenderable.builder().setSource(this,R.raw.hippopotamus).build().thenAccept{modelRenderable -> hippoRender = modelRenderable }
            .exceptionally { throwable ->  Toast.makeText(this@MainActivity,"Este es un oso",Toast.LENGTH_SHORT).show()
                null
            }
        ModelRenderable.builder().setSource(this,R.raw.horse).build().thenAccept{modelRenderable -> horseRender = modelRenderable }
            .exceptionally { throwable ->  Toast.makeText(this@MainActivity,"Este es un oso",Toast.LENGTH_SHORT).show()
                null
            }
        ModelRenderable.builder().setSource(this,R.raw.koala_bear).build().thenAccept{modelRenderable -> koalaRender = modelRenderable }
            .exceptionally { throwable ->  Toast.makeText(this@MainActivity,"Este es un oso",Toast.LENGTH_SHORT).show()
                null
            }
        ModelRenderable.builder().setSource(this,R.raw.lion).build().thenAccept{modelRenderable -> lionRender = modelRenderable }
            .exceptionally { throwable ->  Toast.makeText(this@MainActivity,"Este es un oso",Toast.LENGTH_SHORT).show()
                null
            }
        ModelRenderable.builder().setSource(this,R.raw.reindeer).build().thenAccept{modelRenderable -> reindeerRender = modelRenderable }
            .exceptionally { throwable ->  Toast.makeText(this@MainActivity,"Este es un oso",Toast.LENGTH_SHORT).show()
                null
            }
        ModelRenderable.builder().setSource(this,R.raw.wolverine).build().thenAccept{modelRenderable -> wolverineRender = modelRenderable }
            .exceptionally { throwable ->  Toast.makeText(this@MainActivity,"Este es un oso",Toast.LENGTH_SHORT).show()
                null
            }
    }

    private fun setupClikListener(){
        for(i in arrayView.indices){
            arrayView[i].setOnClickListener(this)
        }
    }

    private fun setupArray(){
        arrayView= arrayOf(bear,cat,cow,dog,elephant,ferret,hippopotamus,horse,koala_bear,lion,reindeer,wolverine)
    }

    private fun createModel(anchorNode: AnchorNode, selected: Int) {
        if (selected==1){
            val bear =TransformableNode(arFragment.transformationSystem)
            bear.setParent(anchorNode)
            bear.scaleController.maxScale.compareTo(0.4f)
            bear.renderable = bearRender
            bear.select()

            addName(anchorNode,bear,"Oso")
        }else{
            if (selected==2){
                val cat =TransformableNode(arFragment.transformationSystem)
                cat.setParent(anchorNode)
                cat.scaleController.maxScale.compareTo(0.4f)
                cat.renderable = catRender
                cat.select()

                addName(anchorNode,cat,"Gato")
            }else{
                if (selected==3){
                    val cow =TransformableNode(arFragment.transformationSystem)
                    cow.setParent(anchorNode)
                    cow.scaleController.maxScale.compareTo(0.4f)
                    cow.renderable = cowRender
                    cow.select()

                    addName(anchorNode,cow,"Vaca")
                }else{
                    if (selected==4){
                        val dog =TransformableNode(arFragment.transformationSystem)
                        dog.setParent(anchorNode)
                        dog.scaleController.maxScale.compareTo(0.4f)
                        dog.renderable = dogRender
                        dog.select()

                        addName(anchorNode,dog,"Perro")
                    }else{
                        if (selected==5){
                            val elepha =TransformableNode(arFragment.transformationSystem)
                            elepha.setParent(anchorNode)
                            elepha.scaleController.maxScale.compareTo(0.7f)
                            elepha.renderable = elephantRender
                            elepha.select()

                            addName(anchorNode,elepha,"Elefante")
                        }else{
                            if (selected==6){
                                val ferre =TransformableNode(arFragment.transformationSystem)
                                ferre.setParent(anchorNode)
                                ferre.scaleController.maxScale.compareTo(0.4f)
                                ferre.renderable = ferretRender
                                ferre.select()

                                addName(anchorNode,ferre,"Oso hormiguero")
                            }else{
                                if (selected==7){
                                    val hippo =TransformableNode(arFragment.transformationSystem)
                                    hippo.setParent(anchorNode)
                                    hippo.scaleController.maxScale.compareTo(0.7f)
                                    hippo.renderable = hippoRender
                                    hippo.select()

                                    addName(anchorNode,hippo,"Hipopotamo")
                                }else{
                                    if (selected==8){
                                        val horse =TransformableNode(arFragment.transformationSystem)
                                        horse.setParent(anchorNode)
                                        horse.scaleController.maxScale.compareTo(0.7f)
                                        horse.renderable = horseRender
                                        horse.select()

                                        addName(anchorNode,horse,"Caballo")
                                    }else{
                                        if (selected==9){
                                            val koala =TransformableNode(arFragment.transformationSystem)
                                            koala.setParent(anchorNode)
                                            koala.scaleController.maxScale.compareTo(0.4f)
                                            koala.renderable = koalaRender
                                            koala.select()

                                            addName(anchorNode,koala,"Koala")
                                        }else{
                                            if (selected==10){
                                                val lion =TransformableNode(arFragment.transformationSystem)
                                                lion.setParent(anchorNode)
                                                lion.scaleController.maxScale.compareTo(0.4f)
                                                lion.renderable = lionRender
                                                lion.select()

                                                addName(anchorNode,lion,"Leon")
                                            }else{
                                                if (selected==11){
                                                    val rein =TransformableNode(arFragment.transformationSystem)
                                                    rein.setParent(anchorNode)
                                                    rein.scaleController.maxScale.compareTo(0.7f)
                                                    rein.renderable = reindeerRender
                                                    rein.select()

                                                    addName(anchorNode,rein,"Reno")
                                                }else{
                                                    if (selected==12){
                                                        val wolve =TransformableNode(arFragment.transformationSystem)
                                                        wolve.setParent(anchorNode)
                                                        wolve.scaleController.maxScale.compareTo(0.4f)
                                                        wolve.renderable = wolverineRender
                                                        wolve.select()

                                                        addName(anchorNode,wolve,"Lobo")
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    private fun addName(anchorNode: AnchorNode, node: TransformableNode, name: String) {
        ViewRenderable.builder().setView(this,R.layout.name_layout).build().thenAccept { viewRenderable ->
            val nameView = TransformableNode(arFragment.transformationSystem)
            nameView.localPosition= Vector3(0f,node.localPosition.y+0.3f,0f)
            nameView.setParent(anchorNode)
            nameView.renderable=viewRenderable
            nameView.select()

            val txt_name=viewRenderable.view as TextView
            txt_name.text=name
            txt_name.setOnClickListener {
                anchorNode.setParent(null)
            }
        }

    }
}
