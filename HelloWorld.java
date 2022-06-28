// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;

public class HelloWorld extends KaitaiStruct {
    public static HelloWorld fromFile(String fileName) throws IOException {
        return new HelloWorld(new ByteBufferKaitaiStream(fileName));
    }

    public HelloWorld(KaitaiStream _io) {
        this(_io, null, null);
    }

    public HelloWorld(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public HelloWorld(KaitaiStream _io, KaitaiStruct _parent, HelloWorld _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
    }
    private Integer one;
    public Integer one() {
        if (this.one != null)
            return this.one;
        long _pos = this._io.pos();
        this._io.seek(0);
        this.one = this._io.readU1();
        this._io.seek(_pos);
        return this.one;
    }
    private HelloWorld _root;
    private KaitaiStruct _parent;
    public HelloWorld _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
