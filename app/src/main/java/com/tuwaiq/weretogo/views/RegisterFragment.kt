//package com.tuwaiq.weretogo.views
//
//import android.os.Bundle
//import android.util.Log
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Toast
//import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.firestore.FirebaseFirestore
//import com.tuwaiq.weretogo.databinding.FragmentRegisterBinding
//import androidx.annotation.NonNull
//
//import com.google.android.gms.tasks.OnFailureListener
//
//import com.google.firebase.firestore.DocumentReference
//
//import com.google.android.gms.tasks.OnSuccessListener
//
//private const val TAG = "RegisterFragment"
//
//// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//
//class RegisterFragment : Fragment() {
//
//    private lateinit var binding : FragmentRegisterBinding
//    private lateinit var auth: FirebaseAuth
//    private lateinit var  firestore: FirebaseFirestore
//
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        binding = FragmentRegisterBinding.inflate(inflater,container,false)
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        binding.regBtn.setOnClickListener{
//            val email = binding.emailEt.text.toString()
//            val password = binding.passRe.text.toString()
//            val userName = binding.usernameTxt.text.toString()
//            registerUser(email, password,userName)
//        }
//    }
//    private fun registerUser(email: String, password: String,userName: String) {
//        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
//            .addOnCompleteListener { task ->
//                if (task.isSuccessful) {
////                     showToast("Login sussed")
//
//
//
//                    // Create a new user with a first and last name
//                    val user = hashMapOf(
//                        "userName" to userName,
//                        "email" to email
//                    )
//// Add a new document with a generated ID
//                    firestore.collection("users")
//                        .add(user)
//                        .addOnSuccessListener { documentReference ->
//                            Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference.id}")
//                        }
//                        .addOnFailureListener { e ->
//                            Log.w(TAG, "Error adding document", e)
//                        }
//                } else {
//                    Log.e(TAG, "there was something wrong", task.exception)
//                }
//            }
//
//            }
//    }
//
//
//





