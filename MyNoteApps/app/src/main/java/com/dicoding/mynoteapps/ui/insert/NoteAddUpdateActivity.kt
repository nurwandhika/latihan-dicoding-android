package com.dicoding.mynoteapps.ui.insert

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.dicoding.mynoteapps.data.database.Note
import com.dicoding.mynoteapps.databinding.ActivityNoteAddUpdateBinding
import com.dicoding.mynoteapps.helper.ViewModelFactory
import com.dicoding.mynoteapps.ui.insert.NoteAddUpdateViewModel

class NoteAddUpdateActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NOTE = "extra_note"
        const val ALERT_DIALOG_CLOSE = 10
        const val ALERT_DIALOG_DELETE = 20
    }
    private var isEdit = false
    private var note: Note? = null
    private lateinit var noteAddUpdateViewModel: NoteAddUpdateViewModel
    private var _activityNoteAddUpdateBinding: ActivityNoteAddUpdateBinding? = null
    private val binding get() = _activityNoteAddUpdateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _activityNoteAddUpdateBinding = ActivityNoteAddUpdateBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        noteAddUpdateViewModel = obtainViewModel(this@NoteAddUpdateActivity)
    }

    override fun onDestroy() {
        super.onDestroy()
        _activityNoteAddUpdateBinding = null
    }
    private fun obtainViewModel(activity: AppCompatActivity): NoteAddUpdateViewModel {
        val factory = ViewModelFactory.getInstance(activity.application)
        return ViewModelProvider(activity, factory).get(NoteAddUpdateViewModel::class.java)
    }
}
