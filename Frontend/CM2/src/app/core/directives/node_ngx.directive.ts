export interface NodePosition {
  x: number;
  y: number;
}
export interface NodeDimension {
  width: number;
  height: number;
}
export interface Node {
  id: any;
  position?: NodePosition;
  dimension?: NodeDimension;
  transform?: string;
  label?: any;
  data?: any;
  meta?: any;
  layoutOptions?: any;
  parentId?: string;
  hidden?: boolean;
  isDiamond?: boolean;
  isAction?:boolean;
  isflow?:boolean;
  isIcon?:boolean;
}
export interface ClusterNode extends Node {
  childNodeIds?: string[];
}
export interface CompoundNode extends Node {
  childNodeIds?: string[];
}
