package com.woodland.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data class Direccio(val carrer:String, val numero:String=
            "", val porta:String="")
        var direccio:Direccio=Direccio("carrer Pelai","65-20")
        var novaDireccio=direccio.copy(numero = "88", porta = "3r 3a")
        println(direccio)
        var (carrer, numero)=novaDireccio
        println(carrer+" , "+numero)

        class BotigaAdapter(private val botigues:List<Botiga> ) :RecyclerView.Adapter<BotigaViewHolder>(){
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BotigaViewHolder {
                val layoutInfl = LayoutInflater.from(parent.context)
                return BotigaViewHolder(layoutInfl.inflate(R.layout.item_botiga,parent,false))
            }
            override fun onBindViewHolder(holder: BotigaViewHolder, position: Int) {
                val item = botigues[position]
                holder.pintaElement(item)
            }
            override fun getItemCount(): Int {
                return botigues.size
            }
        }
}