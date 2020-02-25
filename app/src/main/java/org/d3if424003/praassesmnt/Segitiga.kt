package org.d3if424003.praassesmnt


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if424003.praassesmnt.databinding.FragmentSegitigaBinding



/**
 * A simple [Fragment] subclass.
 *
 */
class Segitiga : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSegitigaBinding>(inflater, R.layout.fragment_segitiga, container, false)

        var alas = binding.etAlasS.text.toString()
        var tinggi = binding.etTinggS.text.toString()

        if (binding.etAlasS.text.isEmpty() or binding.etTinggS.text.isEmpty()) {
            Log.i("test","wajib di isi")
            var luas = binding.etAlasS.text.toString().toInt() * binding.etTinggS.text.toString().toInt()
            var keliling = 2 * (binding.etTinggS.text.toString().toInt() + binding.etTinggS.text.toString().toInt())
            Log.i("test", luas.toString())

            binding.btHitungS.setOnClickListener {
                Log.i("test", luas.toString())

                binding.txtLuasSS.text = luas.toString()
                binding.txtKelilingS.text = keliling.toString()
            }

        }
        return inflater.inflate(R.layout.fragment_segitiga, container, false)
    }


}
