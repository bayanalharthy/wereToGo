package com.tuwaiq.weretogo.views

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.auth.FirebaseAuth
import com.tuwaiq.weretogo.R
import com.tuwaiq.weretogo.databinding.FragmentLoginBinding
import com.tuwaiq.weretogo.util.Validation

private const val TAG = "LoginFragment"


class LoginFragment : Fragment() {


    private lateinit var binding: FragmentLoginBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var email: String
    private lateinit var password: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = FirebaseAuth.getInstance()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val validation = Validation()

//        binding = FragmentLogInBinding.bind(view)
        binding.logBtn.setOnClickListener() {
            email = binding.emailTxt.text.toString()
            password = binding.pass.text.toString()
            loginUser(email, password)
        }
    }

    private fun loginUser(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    // showToast("Login sussed")
                    /*val intent = Intent(requireActivity(),MainActivity::class.java)
                    startActivity(intent)*/
                } else {
                    Log.e(TAG, "there was something wrong", task.exception)
                }

            }
    }
}