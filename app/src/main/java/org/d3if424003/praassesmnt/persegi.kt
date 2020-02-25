package org.d3if424003.praassesmnt


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if424003.praassesmnt.databinding.FragmentPersegiBinding

/**
 * A simple [Fragment] subclass.
 *
 */
class persegi : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding =
            DataBindingUtil.inflate<FragmentPersegiBinding>(inflater, R.layout.fragment_persegi, container, false)

        var panjang = binding.etPanjang.text.toString()
        var lebar = binding.etLebar.text.toString()

        if (binding.etPanjang.text.isEmpty() or binding.etLebar.text.isEmpty()) {
            Log.i("test","wajib di isi")
            var luas = binding.etPanjang.text.toString().toInt() * binding.etLebar.text.toString().toInt()
            var keliling = 2 * (binding.etPanjang.text.toString().toInt() + binding.etLebar.text.toString().toInt())
            Log.i("test", luas.toString())

            binding.btHitungPP.setOnClickListener {
                Log.i("test", luas.toString())

                binding.txLuasPP.text = luas.toString()
                binding.txKelilingPP.text = keliling.toString()
            }
        }

        return inflater.inflate(R.layout.fragment_persegi, container, false)
    }

}

