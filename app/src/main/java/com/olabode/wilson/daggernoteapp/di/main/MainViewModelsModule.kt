package com.olabode.wilson.daggernoteapp.di.main

import androidx.lifecycle.ViewModel
import com.olabode.wilson.daggernoteapp.MainActivityViewModel
import com.olabode.wilson.daggernoteapp.di.annotations.ViewModelKey
import com.olabode.wilson.daggernoteapp.ui.dialogs.LabelDialogViewModel
import com.olabode.wilson.daggernoteapp.ui.favourite.FavouritesViewModel
import com.olabode.wilson.daggernoteapp.ui.home.HomeViewModel
import com.olabode.wilson.daggernoteapp.ui.labels.LabelViewModel
import com.olabode.wilson.daggernoteapp.ui.labelview.LabelNoteViewModel
import com.olabode.wilson.daggernoteapp.ui.notes.NoteViewModel
import com.olabode.wilson.daggernoteapp.ui.trash.TrashViewModel
import com.olabode.wilson.daggernoteapp.ui.trash.ViewTrashNoteViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 *   Created by OLABODE WILSON on 2020-03-03.
 */

@Module
abstract class MainViewModelsModule {

    @IntoMap
    @Binds
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(viewModel: HomeViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(FavouritesViewModel::class)
    abstract fun bindFavouriteViewModel(viewModel: FavouritesViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(TrashViewModel::class)
    abstract fun bindTrashViewModel(viewModel: TrashViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(NoteViewModel::class)
    abstract fun bindNoteViewModel(viewModel: NoteViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(ViewTrashNoteViewModel::class)
    abstract fun bindViewTrashNoteViewModel(viewModel: ViewTrashNoteViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(LabelViewModel::class)
    abstract fun bindLabelViewModel(viewModel: LabelViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainActivityViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(LabelNoteViewModel::class)
    abstract fun bindLabelNoteViewerViewModel(viewModel: LabelNoteViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(LabelDialogViewModel::class)
    abstract fun bindLabelDialogViewModel(viewModel: LabelDialogViewModel): ViewModel
}
