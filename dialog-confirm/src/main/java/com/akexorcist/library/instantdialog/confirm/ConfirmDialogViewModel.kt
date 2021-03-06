package com.akexorcist.library.instantdialog.confirm

import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModel
import com.akexorcist.instantdialog.core.DialogEvent
import com.akexorcist.instantdialog.core.SingleLiveEvent

class ConfirmDialogViewModel : ViewModel() {
    val positiveButtonClicked = SingleLiveEvent<DialogEvent>()
    val negativeButtonClicked = SingleLiveEvent<DialogEvent>()
    val dialogDismiss = SingleLiveEvent<DialogEvent>()

    fun onPositiveButtonClick(dialog: DialogFragment, tag: String?, bundle: Bundle?) {
        positiveButtonClicked(DialogEvent(dialog, tag, bundle))
    }

    fun onNegativeButtonClick(dialog: DialogFragment, tag: String?, bundle: Bundle?) {
        negativeButtonClicked(DialogEvent(dialog, tag, bundle))
    }

    fun onDialogDismiss(dialog: DialogFragment, tag: String?, bundle: Bundle?) {
        dialogDismiss(DialogEvent(dialog, tag, bundle))
    }
}