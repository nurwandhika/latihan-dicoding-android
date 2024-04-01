package com.dicoding.myreadwritefile

import android.content.Context

internal object FileHelper {

    fun writeToFile(fileModel: FileModel, context: Context) {
        context.openFileOutput(fileModel.filename, Context.MODE_PRIVATE).use { output ->  // Rename 'it' to a more descriptive name
            output.write(fileModel.data?.toByteArray())
        }
    }

    fun readFromFile(context: Context, filename: String): FileModel {
        val fileModel = FileModel()
        fileModel.filename = filename
        fileModel.data = context.openFileInput(filename).bufferedReader().useLines { lines ->
            lines.fold("") { accumulator: String, text: String ->  // Specify types for lambda parameters
                "$accumulator$text\n"
            }
        }
        return fileModel
    }
}
